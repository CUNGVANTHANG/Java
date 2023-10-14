import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class Philosopher extends Thread {
    private final Semaphore leftChopstick;
    private final Semaphore rightChopstick;
    private final String philosophers;

    Philosopher(Semaphore leftChopstick, Semaphore rightChopstick, int number) {
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
        this.philosophers = "Philosopher " + number;
    }

    @Override
    public void run() {
        try {
            while (true) {
                act(" is thinking");
                leftChopstick.acquire();
                act(" take up the left chopstick");
                rightChopstick.acquire();
                act(" take up the right chopstick and is eating");
                rightChopstick.release();
                act(" put down the right chopstick");
                leftChopstick.release();
                act(" put down the left chopstick and stopped eating, is thinking");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void act(String message) throws InterruptedException {
        System.out.println(philosophers + message);
        Thread.sleep(((int) (Math.random() * 1000))); // Tạm ngừng luồng trong khoảng thời gian ngẫu nhiên để mô phỏng
                                                      // suy nghĩ hoặc ăn
    }
}

public class DiningPhilosophersMain {
    private static final int NUMBER_OF_PHILOSOPHERS = 5;

    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[NUMBER_OF_PHILOSOPHERS];
        Semaphore[] chopsticks = new Semaphore[NUMBER_OF_PHILOSOPHERS];

        for (int i = 0; i < NUMBER_OF_PHILOSOPHERS; i++) {
            chopsticks[i] = new Semaphore(1); // Khởi tạo Semaphore cho từng cây đũa với giá trị ban đầu là 1
        }

        // Quản lý và thực thi các triết học (mỗi triết học là một tác vụ) bằng cách sử
        // dụng một
        // pool luồng cố định, đảm bảo rằng không có quá nhiều triết học cùng thời gian
        // thực thi và
        // chia sẻ các tài nguyên luồng
        ExecutorService executor = Executors.newFixedThreadPool(NUMBER_OF_PHILOSOPHERS);

        for (int i = 0; i < NUMBER_OF_PHILOSOPHERS; i++) {
            Semaphore leftChopstick = chopsticks[i];
            Semaphore rightChopstick = chopsticks[(i + 1) % NUMBER_OF_PHILOSOPHERS];

            philosophers[i] = new Philosopher(leftChopstick, rightChopstick, (i + 1));

            // Tạo và khởi động mỗi triết học với cây đũa bên trái và bên phải tương ứng
            // philosophers[i] = i == NUMBER_OF_PHILOSOPHERS - 1
            // ? new Philosopher(rightChopstick, leftChopstick, (i + 1))
            // : new Philosopher(leftChopstick, rightChopstick, (i + 1));

            executor.submit(philosophers[i]); // Đưa triết học vào Executor để chạy
        }
    }
}