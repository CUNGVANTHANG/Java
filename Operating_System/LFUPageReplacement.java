import java.util.HashMap;

public class LFUPageReplacement {
    public static void main(String[] args) {
        // int[] pageReferences = { 5, 3, 1, 2, 3, 1, 0, 4, 2, 1, 4, 3, 0, 1, 3, 0, 1, 4
        // };
        // int[] pageReferences = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 1, 2, 0 };
        // int[] pageReferences = { 1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5 };

        int[] pageReferences = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1 };
        int frameSize = 1; // Số lượng khung trang có sẵn trong bộ nhớ
        int pageFaults = 0;
        int pageHits = 0;

        int[][] table = new int[frameSize][pageReferences.length];
        int[] tableHits = new int[pageReferences.length];
        int count = 0;

        // Mảng để lưu trạng thái của các khung trang và tần suất sử dụng
        int[] frameArray = new int[frameSize];
        int[] frequencyArray = new int[frameSize];

        // HashMap để lưu trang và vị trí của nó trong frameArray
        HashMap<Integer, Integer> pagePositionMap = new HashMap<>();

        for (int i = 0; i < frameSize; i++) {
            frameArray[i] = -1; // Khung trang ban đầu trống
            frequencyArray[i] = 0; // Tần suất sử dụng ban đầu là 0
        }

        for (int i = 0; i < pageReferences.length; i++) {
            int page = pageReferences[i];
            boolean pageFound = false;

            // Kiểm tra xem trang hiện tại đã nằm trong khung trang chưa
            for (int j = 0; j < frameSize; j++) {
                if (frameArray[j] == page) {
                    pageFound = true;
                    pageHits++;
                    frequencyArray[j]++; // Tăng tần suất sử dụng cho trang này
                    for (int k = 0; k < frameSize; k++) {
                        table[k][i] = frameArray[k];
                    }
                    tableHits[count] = i;
                    count++;
                }
            }

            if (!pageFound) {
                pageFaults++;

                // Tìm trang có tần suất sử dụng thấp nhất
                int indexToRemove = 0;
                int minFrequency = frequencyArray[0];
                for (int j = 1; j < frameSize; j++) {
                    if (frequencyArray[j] < minFrequency) {
                        minFrequency = frequencyArray[j];
                        indexToRemove = j;
                    }
                }

                // Thay thế trang có tần suất sử dụng thấp nhất bằng trang mới
                frameArray[indexToRemove] = page;
                frequencyArray[indexToRemove] = 1;

                for (int j = 0; j < frameSize; j++) {
                    table[j][i] = frameArray[j];
                }

                pagePositionMap.put(page, indexToRemove); // Cập nhật vị trí của trang trong frameArray
            }
        }

        System.out.println("\n                          LFU PAGE REPLACEMENT");
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
