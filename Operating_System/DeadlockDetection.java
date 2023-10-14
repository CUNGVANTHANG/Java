import java.util.Arrays;

public class DeadlockDetection {
    static int PROCESS_NUMBER = 5;
    static int RESOURCE_NUMBER = 3;

    public static void main(String[] args) {

        int[][] allocation = {
                { 0, 1, 0 },
                { 2, 0, 0 },
                { 3, 0, 3 },
                { 2, 1, 1 },
                { 0, 0, 2 }
        };
        int[][] request = {
                { 0, 0, 0 },
                { 2, 0, 2 },
                { 0, 0, 1 },
                { 1, 0, 0 },
                { 0, 0, 2 }
        };
        int resource[] = { 7, 2, 6 };
        int[] available = new int[RESOURCE_NUMBER];
        calculateAvailable(allocation, resource, available);

        int work[] = new int[RESOURCE_NUMBER];
        for (int i = 0; i < RESOURCE_NUMBER; i++) {
            work[i] = available[i];
        }
        printTable(allocation, request, available);

        boolean[] finish = new boolean[PROCESS_NUMBER];
        boolean deadlock = false;

        initializeFinish(allocation, finish);

        while (!deadlock) {
            deadlock = true;
            if (nextExists(allocation, request, work, finish)) {
                deadlock = false;
            }
        }

        boolean isDeadlock = false;
        for (boolean each : finish) {
            if (!each) {
                isDeadlock = true;
                break;
            }
        }

        if (isDeadlock) {
            System.out.print("Hệ thống bị bế tắc, quy trình tham gia bế tắc: ");
            for (int i = 0; i < finish.length; i++) {
                if (!finish[i]) {
                    System.out.print("P" + i + ", ");
                }
            }
        } else {
            System.out.print("Không có bế tắc.");
        }
        System.out.println("\nMảng finish cuối cùng: " + Arrays.toString(finish));
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

    static void printTable(int allocation[][], int request[][], int available[]) {
        System.out.print(
                "Process" + "\t\t" + "Allocation" + "\t" + "Request" + "\t\t" + "Available" + "\n");
        for (int i = 0; i < PROCESS_NUMBER; i++) {
            System.out.print("P" + i + "\t\t");
            for (int j = 0; j < RESOURCE_NUMBER; j++) {
                System.out.print(allocation[i][j] + " ");
            }
            System.out.print("\t\t");
            for (int j = 0; j < RESOURCE_NUMBER; j++) {
                System.out.print(request[i][j] + " ");
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

    static boolean nextExists(int allocation[][], int request[][], int work[], boolean finish[]) {
        for (int i = 0; i < PROCESS_NUMBER; i++) {
            boolean isSmaller = true;
            for (int j = 0; j < RESOURCE_NUMBER; j++) {
                if (request[i][j] > work[j]) {
                    isSmaller = false;
                    break;
                }
            }
            if (isSmaller && !finish[i]) {
                finish[i] = true;
                for (int j = 0; j < RESOURCE_NUMBER; j++) {
                    work[j] += allocation[i][j];
                }
                return true;
            }
        }
        return false;
    }

    static void initializeFinish(int allocation[][], boolean finish[]) {
        for (int i = 0; i < PROCESS_NUMBER; i++) {
            boolean assigned = false;
            for (int j = 0; j < RESOURCE_NUMBER; j++) {
                if (allocation[i][j] != 0) {
                    assigned = true;
                    break;
                }
            }
            finish[i] = !assigned;
        }
    }
}
