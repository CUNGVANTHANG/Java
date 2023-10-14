import java.util.concurrent.Semaphore;

public class ThreeProcesses {
    private static Semaphore S0 = new Semaphore(1);
    private static Semaphore S1 = new Semaphore(1);
    private static Semaphore S2 = new Semaphore(0);

    public static void main(String[] args) {
        Thread P0 = new Thread(() -> {
            try {
                while (true) {
                    S0.acquire(); // Chờ S0
                    System.out.print('0');
                    Thread.sleep(100);
                    S1.release(); // Tăng giá trị của S1
                    S2.release(); // Tăng giá trị của S2
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread P1 = new Thread(() -> {
            try {

                S1.acquire(); // Chờ S1
                S0.release(); // Tăng giá trị của S0

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread P2 = new Thread(() -> {
            try {

                S2.acquire(); // Chờ S2
                S0.release(); // Tăng giá trị của S0

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        P0.start();
        P1.start();
        P2.start();
    }
}
