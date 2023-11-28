public class FIFOPageReplacement {
    public static void main(String[] args) {
        // int[] pageReferences = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 1, 2, 0 };
        // int[] pageReferences = { 1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5 };
        // int[] pageReferences = { 5, 3, 1, 2, 3, 1, 0, 4, 2, 1, 4, 3, 0, 1, 3, 0, 1, 4
        // };
        // int[] pageReferences = { 1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8
        // };

        int[] pageReferences = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1 };
        int frameSize = 4; // Số lượng khung trang có sẵn trong bộ nhớ
        int[] frameArray = new int[frameSize]; // Mảng lưu trạng thái các khung trang
        int pageFaults = 0;
        int pageHits = 0;

        int[][] table = new int[frameSize][pageReferences.length];
        int[] tableHits = new int[pageReferences.length];
        int count = 0;

        // Khởi tạo mảng khung trang với giá trị -1 để biểu thị khung trang trống
        for (int i = 0; i < frameSize; i++) {
            frameArray[i] = -1;
        }

        int currentIndex = 0; // Chỉ mục hiện tại trong mảng khung trang

        for (int i = 0; i < pageReferences.length; i++) {
            int page = pageReferences[i];
            boolean pageFound = false;

            // Kiểm tra xem trang hiện tại đã nằm trong khung trang chưa
            for (int j = 0; j < frameSize; j++) {
                if (frameArray[j] == page) {
                    pageFound = true;
                    pageHits++;
                    for (int k = 0; k < frameSize; k++) {
                        table[k][i] = frameArray[k];
                    }
                    tableHits[count] = i;
                    count++;
                    break;
                }
            }

            // Nếu trang không tìm thấy trong khung trang (page fault)
            if (!pageFound) {
                pageFaults++;

                // Chỉ cập nhật khung trang nếu trang hiện tại là trang fault
                frameArray[currentIndex] = page;

                // Di chuyển chỉ mục hiện tại sang khung trang tiếp theo (theo nguyên tắc FIFO)
                currentIndex = (currentIndex + 1) % frameSize;

                // In trạng thái khung trang
                for (int j = 0; j < frameSize; j++) {
                    table[j][i] = frameArray[j];
                }
            }
        }

        System.out.println("\n                          FIFO PAGE REPLACEMENT");
        System.out.print("---------------------------------------------------------------------------\n\n");
        System.out.println("References String: ");
        System.out.print("     ");
        int index = 0;
        for (int i = 0; i < pageReferences.length; i++) {
            if (tableHits[index] == i && pageHits > 0) {
                System.out.print(pageReferences[i] + "*" + "  ");
                index++;
            } else {
                System.out.print(pageReferences[i] + "   ");
            }
        }
        System.out.println();

        System.out.print("     --------------------------------------------------------------------->");
        System.out.print("\n\n");

        for (int i = 0; i < frameSize; i++) {
            System.out.print("F" + (i + 1) + "   ");
            for (int j = 0; j < pageReferences.length; j++) {
                if (table[i][j] == -1) {
                    System.out.print("    ");
                } else {
                    System.out.print(table[i][j] + "   ");
                }
            }
            System.out.println();
        }

        System.out.println("\nTotal page faults: " + pageFaults);
        System.out.println("Total page hits: " + pageHits);

        System.out.print("---------------------------------------------------------------------------\n");
    }
}