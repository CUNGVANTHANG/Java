import java.util.concurrent.Semaphore;

class BoundedBuffer {
    private int[] buffer;
    private int size;
    private Semaphore mutex;
    private Semaphore empty;
    private Semaphore full;

    public BoundedBuffer(int capacity) {
        buffer = new int[capacity];
        size = 0;
        mutex = new Semaphore(1);
        empty = new Semaphore(capacity);
        full = new Semaphore(0);
    }

    public void produce(int item) throws InterruptedException {
        empty.acquire();
        mutex.acquire();

        // Add item to buffer
        buffer[size] = item;
        size++;
        System.out.println("Produced: " + item + " \t\t|\t    Buffer: " + calculateBufferSum());

        mutex.release();
        full.release();
    }

    public int consume() throws InterruptedException {
        full.acquire();
        mutex.acquire();

        // Remove and return item from buffer
        int item = buffer[size - 1];
        size--;
        System.out.println("Consumed: " + item + " \t\t|\t    Buffer: " + calculateBufferSum());

        mutex.release();
        empty.release();

        return item;
    }

    public int calculateBufferSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += buffer[i];
        }
        return sum;
    }
}

class Producer implements Runnable {
    private BoundedBuffer buffer;

    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = (int) (Math.random() * 100);
                buffer.produce(item);
                Thread.sleep((int) (Math.random() * 2000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private BoundedBuffer buffer;

    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = buffer.consume();
                Thread.sleep((int) (Math.random() * 2000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class BoundedBufferMain {
    public static void main(String[] args) {
        int capacity = 3;
        BoundedBuffer buffer = new BoundedBuffer(capacity);

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        System.out.println("   State \t\t|\t      Buffer");
        producerThread.start();
        consumerThread.start();
    }
}