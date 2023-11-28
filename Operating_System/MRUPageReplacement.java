public class MRUPageReplacement {
    public static void main(String[] args) {
        int[] pageReferences = { 5, 3, 1, 2, 3, 1, 0, 4, 2, 1, 4, 3, 0, 1, 3, 0, 1, 4 };
        // int[] pageReferences = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 1, 2, 0 };
        // int[] pageReferences = { 1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5 };
        int frameSize = 3; // Số lượng khung trang có sẵn trong bộ nhớ
        int pageFaults = 0;
        int pageHits = 0;

        int[][] table = new int[frameSize][pageReferences.length];
        int[] tableHits = new int[pageReferences.length];
        int count = 0;

        // Mảng để lưu trạng thái của các khung trang và thời điểm sử dụng gần đây nhất
        int[] frameArray = new int[frameSize];
        int[] lastUsedTime = new int[frameSize];

        for (int i = 0; i < frameSize; i++) {
            frameArray[i] = -1; // Khung trang ban đầu trống
            lastUsedTime[i] = 0; // Thời điểm sử dụng gần đây nhất là 0
        }

        for (int i = 0; i < pageReferences.length; i++) {
            int page = pageReferences[i];
            boolean pageFound = false;

            // Kiểm tra xem trang hiện tại đã nằm trong khung trang chưa
            for (int j = 0; j < frameSize; j++) {
                if (frameArray[j] == page) {
                    pageFound = true;
                    pageHits++;
                    lastUsedTime[j] = 0; // Đặt thời điểm sử dụng gần đây nhất cho trang này là 0
                    for (int k = 0; k < frameSize; k++) {
                        table[k][i] = frameArray[k];
                    }
                    tableHits[count] = i;
                    count++;
                } else {
                    lastUsedTime[j]++; // Tăng thời gian sử dụng gần đây của các trang khác
                }
            }

            if (!pageFound) {
                pageFaults++;

                // Tìm trang có thời điểm sử dụng gần đây nhất thấp nhất (Least Recently Used)
                int indexToRemove = 0;
                int minLastUsedTime = lastUsedTime[0];
                for (int j = 1; j < frameSize; j++) {
                    if (lastUsedTime[j] < minLastUsedTime) {
                        minLastUsedTime = lastUsedTime[j];
                        indexToRemove = j;
                    }
                }

                // Thay thế trang có thời điểm sử dụng gần đây nhất thấp nhất bằng trang mới
                frameArray[indexToRemove] = page;
                lastUsedTime[indexToRemove] = frameSize;

                for (int j = 0; j < frameSize; j++) {
                    table[j][i] = frameArray[j];
                }
            }
        }

        System.out.println("\n                          MRU PAGE REPLACEMENT");
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
