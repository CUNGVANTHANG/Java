import java.util.concurrent.Semaphore;

public class DiningPhilosophers {
    public static class Philosopher implements Runnable {
        private Semaphore leftFork;
        private Semaphore rightFork;

        public Philosopher(Semaphore leftFork, Semaphore rightFork) {
            this.leftFork = leftFork;
            this.rightFork = rightFork;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    // thinking
                    doAction(": Thinking");

                    // Acquire left fork
                    leftFork.acquire();
                    doAction(": Picked up left fork");

                    int delay = Math.random() < 0.5 ? 1 : 1000;
                    Thread.sleep(delay);

                    // Acquire right fork
                    rightFork.acquire();
                    doAction(": Picked up right fork");

                    doAction(": eat");

                    // Release right fork
                    rightFork.release();
                    doAction(": Put down right fork");

                    // Release left fork
                    leftFork.release();
                    doAction(": Put down left fork");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        private void doAction(String action) throws InterruptedException {
            System.out.println(Thread.currentThread().getName() + " " + action);
            Thread.sleep((int) (Math.random() * 100));
        }
    }

    public static void main(String[] args) throws Exception {
        Philosopher[] philosophers = new Philosopher[5];
        Semaphore[] forks = new Semaphore[philosophers.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Semaphore(1); // Each fork is initially available
        }

        for (int i = 0; i < philosophers.length; i++) {
            Semaphore leftFork = forks[i];
            Semaphore rightFork = forks[(i + 1) % forks.length];

            // TH1: Xảy ra deadlock
            // philosophers[i] = new Philosopher(leftFork, rightFork);

            // TH2: Khắc phục deadlock
            if (i == philosophers.length - 1) {
                // The last philosopher picks up the right fork first
                philosophers[i] = new Philosopher(rightFork, leftFork);
            } else {
                philosophers[i] = new Philosopher(leftFork, rightFork);
            }

            Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}