public class SecondChancePageReplacement {
    public static void main(String[] args) {
        // int[] pageReferences = { 5, 3, 1, 2, 3, 1, 0, 4, 2, 1, 4, 3, 0, 1, 3, 0, 1, 4
        // };
        int[] pageReferences = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1 };

        int frameSize = 4;
        int pageHits = 0;
        int pageFaults = 0;
        int[] frameArray = new int[frameSize];
        boolean[] secondChanceBit = new boolean[frameSize];
        int pointer = 0; // Con trỏ trỏ tới trang được xem xét

        int[][] table = new int[frameSize][pageReferences.length];
        int[] tableHits = new int[pageReferences.length];
        int count = 0;

        for (int i = 0; i < frameSize; i++) {
            frameArray[i] = -1; // Khung trang ban đầu trống
            secondChanceBit[i] = false;
        }

        for (int i = 0; i < pageReferences.length; i++) {
            int page = pageReferences[i];
            boolean pageFound = false;

            for (int j = 0; j < frameSize; j++) {
                if (frameArray[j] == page) {
                    pageHits++;
                    pageFound = true;
                    secondChanceBit[j] = true;
                    for (int k = 0; k < frameSize; k++) {
                        table[k][i] = frameArray[k];
                    }
                    tableHits[count] = i;
                    count++;
                    break;
                }
            }

            if (!pageFound) {
                while (true) {
                    if (!secondChanceBit[pointer]) {
                        frameArray[pointer] = page;
                        secondChanceBit[pointer] = true;
                        pointer = (pointer + 1) % frameSize;
                        pageFaults++;
                        break;
                    } else {
                        secondChanceBit[pointer] = false;
                        pointer = (pointer + 1) % frameSize;
                    }
                }
                for (int j = 0; j < frameSize; j++) {
                    table[j][i] = frameArray[j];
                }
            }
        }
        System.out.println("\n                          SECOND CHANCE PAGE REPLACEMENT");
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
