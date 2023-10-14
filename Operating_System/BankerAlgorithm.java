class BankersAlgorithm {
    static int PROCESS_NUMBER = 5;
    static int RESOURCE_NUMBER = 3;

    public static void main(String[] args) {
        int resource[] = { 10, 5, 7 };
        int max[][] = {
                { 7, 5, 3 },
                { 3, 2, 2 },
                { 9, 0, 2 },
                { 2, 2, 2 },
                { 4, 3, 3 } };

        int allocation[][] = {
                { 0, 1, 0 },
                { 2, 0, 0 },
                { 3, 0, 2 },
                { 2, 1, 1 },
                { 0, 0, 2 } };

        isSafe(allocation, max, resource);
        System.out.println();

        int processId = 0;
        int request[] = { 0, 2, 0 };

        System.out.print("P" + processId + " yêu cầu request: ");
        for (int i = 0; i < RESOURCE_NUMBER; i++) {
            System.out.print(request[i] + " ");
        }
        System.out.println();

        requestResource(allocation, max, resource, processId, request);
    }

    static void calculateAvailable(int allocation[][], int resource[], int available[]) {
        int total = 0;
        for (int j = 0; j < RESOURCE_NUMBER; j++) {
            for (int i = 0; i < PROCESS_NUMBER; i++) {
                total += allocation[i][j];
            }
            available[j] = resource[j] - total;
            total = 0;
        }
    }

    static void calculateNeed(int allocation[][], int max[][], int need[][]) {
        for (int i = 0; i < PROCESS_NUMBER; i++) {
            for (int j = 0; j < RESOURCE_NUMBER; j++) {
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }
    }

    static void printTable(int allocation[][], int max[][], int available[], int need[][]) {
        System.out.print(
                "Process" + "\t\t" + "Allocation" + "\t" + "Max" + "\t\t" + "Need" + "\t\t" + "Available" + "\n");
        for (int i = 0; i < PROCESS_NUMBER; i++) {
            System.out.print("P" + i + "\t\t");
            for (int j = 0; j < RESOURCE_NUMBER; j++) {
                System.out.print(allocation[i][j] + " ");
            }
            System.out.print("\t\t");
            for (int j = 0; j < RESOURCE_NUMBER; j++) {
                System.out.print(max[i][j] + " ");
            }
            System.out.print("\t\t");
            for (int j = 0; j < RESOURCE_NUMBER; j++) {
                System.out.printf(need[i][j] + " ");
            }
            System.out.print("\t\t");
            if (i == 0) {
                for (int j = 0; j < RESOURCE_NUMBER; j++) {
                    System.out.printf(available[j] + " ");
                }
            }
            System.out.println();
        }
    }

    static boolean isSafe(int allocation[][], int max[][], int resource[]) {
        int need[][] = new int[PROCESS_NUMBER][RESOURCE_NUMBER];
        calculateNeed(allocation, max, need);
        int available[] = new int[RESOURCE_NUMBER];
        calculateAvailable(allocation, resource, available);

        printTable(allocation, max, available, need);
        System.out.println();

        int tableWork[][] = new int[PROCESS_NUMBER][RESOURCE_NUMBER];

        int work[] = new int[RESOURCE_NUMBER];
        boolean finish[] = new boolean[PROCESS_NUMBER];
        for (int i = 0; i < RESOURCE_NUMBER; i++) {
            work[i] = available[i];
            finish[i] = false;
        }
        int safeSequence[] = new int[PROCESS_NUMBER];

        int count = 0;
        while (count < PROCESS_NUMBER) {
            boolean found = false;
            for (int i = 0; i < PROCESS_NUMBER; i++) {
                if (!finish[i]) {
                    int j;

                    for (j = 0; j < RESOURCE_NUMBER; j++) {
                        if (need[i][j] > work[j]) {
                            break;
                        }
                    }
                    if (j == RESOURCE_NUMBER) {
                        for (int k = 0; k < RESOURCE_NUMBER; k++) {
                            work[k] += allocation[i][k];
                            tableWork[count][k] = work[k];
                        }
                        safeSequence[count++] = i;
                        finish[i] = true;
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("Hệ thống không trong trạng thái an toàn.");
                return false;
            }
        }

        System.out.print("Process" + "\t\t" + "Work" + "\n");
        for (int i = 0; i < PROCESS_NUMBER; i++) {
            System.out.print("P" + safeSequence[i] + "\t\t");
            for (int j = 0; j < RESOURCE_NUMBER; j++) {
                System.out.print(tableWork[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Hệ thống trong trạng thái an toàn.");
        System.out.print("Dãy an toàn: ");
        for (int i = 0; i < PROCESS_NUMBER; i++) {
            System.out.print("P" + safeSequence[i] + " ");
        }
        System.out.println();

        return true;
    }

    static boolean requestResource(int allocation[][], int max[][], int resource[], int processId, int request[]) {
        int need[][] = new int[PROCESS_NUMBER][RESOURCE_NUMBER];
        calculateNeed(allocation, max, need);
        int available[] = new int[RESOURCE_NUMBER];
        calculateAvailable(allocation, resource, available);

        // Kiểm tra xem request có lớn hơn hoặc bằng 0 không
        for (int i = 0; i < RESOURCE_NUMBER; i++) {
            if (request[i] < 0) {
                System.out.println("Yêu cầu không hợp lệ. Yêu cầu phải lớn hơn hoặc bằng 0 cho tất cả các tài nguyên.");
                return false;
            }
        }

        // Kiểm tra xem request có lớn hơn hoặc bằng tài nguyên còn lại không
        for (int i = 0; i < RESOURCE_NUMBER; i++) {
            if (request[i] > available[i]) {
                System.out
                        .println("Yêu cầu không thể được thỏa mãn ngay lúc này. Request nhiều hơn tài nguyên còn lại.");
                return false;
            }
        }

        // Kiểm tra xem request có lớn hơn hoặc bằng tài nguyên còn lại cho quy trình Pi
        // không
        for (int i = 0; i < RESOURCE_NUMBER; i++) {
            if (request[i] > need[processId][i]) {
                System.out.println("Yêu cầu không hợp lệ. Request vượt quá nhu cầu của quy trình Pi.");
                return false;
            }
        }

        // Tạm thời cấp phát tài nguyên cho quy trình Pi để kiểm tra an toàn
        for (int i = 0; i < RESOURCE_NUMBER; i++) {
            available[i] -= request[i];
            allocation[processId][i] += request[i];
            need[processId][i] -= request[i];
        }

        // Kiểm tra xem việc cấp phát này có làm hệ thống không an toàn không
        if (isSafe(allocation, max, resource)) {
            // Nếu an toàn, việc cấp phát request là hợp lệ
            System.out.println("Yêu cầu cấp phát tài nguyên cho quy trình P" + processId + " là hợp lệ.");
            return true;
        } else {
            // Nếu không an toàn, hoàn nguyên tình trạng trước đó và thông báo request không
            // được thực hiện
            System.out.println("Yêu cầu cấp phát tài nguyên cho quy trình P" + processId
                    + " không thể được thực hiện vì nó làm hệ thống không an toàn.");
            for (int i = 0; i < RESOURCE_NUMBER; i++) {
                available[i] += request[i];
                allocation[processId][i] -= request[i];
                need[processId][i] += request[i];
            }
            return false;
        }
    }
}