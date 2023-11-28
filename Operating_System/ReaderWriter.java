import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

class ReadWriteLock {
    private Semaphore readLock;
    private Semaphore writeLock;
    private Semaphore turnstile;
    private Semaphore mutex;
    private int readers;
    private Semaphore allReadersFinished; // Semaphore để đợi tất cả các độc giả hoàn thành

    public ReadWriteLock() {
        readLock = new Semaphore(1);
        writeLock = new Semaphore(1);
        turnstile = new Semaphore(1);
        mutex = new Semaphore(1);
        readers = 0;
        allReadersFinished = new Semaphore(0); // Khởi tạo Semaphore với giá trị ban đầu là 0
    }

    public void startRead() throws InterruptedException {
        readLock.acquire();
        mutex.acquire();
        if (readers == 0) {
            writeLock.acquire();
        }
        readers++;
        mutex.release();
        readLock.release();
    }

    public void endRead() throws InterruptedException {
        mutex.acquire();
        readers--;
        if (readers == 0) {
            writeLock.release();
            allReadersFinished.release(); // Báo hiệu rằng tất cả các người đọc đã hoàn thành
        }
        mutex.release();
    }

    public void startWrite() throws InterruptedException {
        turnstile.acquire();
        allReadersFinished.acquire(); // Chờ tất cả các độc giả hoàn thành trước khi viết
        writeLock.acquire();
    }

    public void endWrite() {
        writeLock.release();
        turnstile.release();
    }
}

class Writer implements Runnable {
    private ReadWriteLock rwLock;
    private StringBuilder sharedMemory;
    private boolean writeEnabled;
    private boolean shouldClear;
    private String name;

    public Writer(ReadWriteLock rwLock, String name, StringBuilder sharedMemory) {
        this.rwLock = rwLock;
        this.sharedMemory = sharedMemory;
        this.writeEnabled = true;
        this.shouldClear = false;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true) {
                rwLock.startWrite();
                if (writeEnabled) {
                    if (shouldClear) {
                        sharedMemory.setLength(0); // Xóa toàn bộ dữ liệu trong bộ nhớ
                        System.out.println(name + " is clearing memory." + "\t" + name + " is reading: "
                                + sharedMemory.toString());
                    } else {
                        char randomChar = (char) (ThreadLocalRandom.current().nextInt(32, 126)); // Ngẫu nhiên chọn một
                        // ký tự từ 'a' đến 'z'
                        sharedMemory.append(randomChar);
                        System.out.println(
                                name + " is writing: " + randomChar + "\t\t" + name + " is reading: "
                                        + sharedMemory.toString());
                    }
                } else {
                    // Nếu người viết không ghi, họ có thể đọc từ bộ nhớ
                    String currentContent = sharedMemory.toString();
                    System.out.println(name + " no writing: " + "\t\t" + name + " is reading: " + currentContent);
                }
                rwLock.endWrite();
                System.out.println(name + " stopped writing.");
                // Thực hiện xử lý sau khi viết
                Thread.sleep((int) (Math.random() * 5000)); // Tạm ngừng để mô phỏng
                // Đặt lại trạng thái ngẫu nhiên
                writeEnabled = ThreadLocalRandom.current().nextBoolean();
                shouldClear = ThreadLocalRandom.current().nextBoolean();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}

class Reader implements Runnable {
    private ReadWriteLock rwLock;
    private String name;
    private StringBuilder sharedMemory;

    public Reader(ReadWriteLock rwLock, String name, StringBuilder sharedMemory) {
        this.rwLock = rwLock;
        this.name = name;
        this.sharedMemory = sharedMemory;
    }

    @Override
    public void run() {
        try {
            while (true) {
                rwLock.startRead();
                // Người đọc đọc dữ liệu từ bộ nhớ
                System.out.println("\t\t\t\t" + name + " is reading: " + sharedMemory.toString());
                // Kết thúc đọc
                rwLock.endRead();
                System.out.println("\t\t\t\t" + name + " stopped reading: ");
                // Thực hiện xử lý sau khi đọc
                Thread.sleep((int) (Math.random() * 5000)); // Tạm ngừng để mô phỏng
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ReaderWriter {
    public static void main(String[] args) {
        ReadWriteLock rwLock = new ReadWriteLock();
        StringBuilder sharedMemory = new StringBuilder();
        System.out.print("    Writing status" + "\t\t" + "  Reading status" + "\n");

        Writer writer1 = new Writer(rwLock, "Writer 1", sharedMemory);
        Writer writer2 = new Writer(rwLock, "Writer 2", sharedMemory);
        Writer writer3 = new Writer(rwLock, "Writer 3", sharedMemory);

        Thread writerThread1 = new Thread(writer1);
        Thread writerThread2 = new Thread(writer2);
        Thread writerThread3 = new Thread(writer3);

        Thread readerThread1 = new Thread(new Reader(rwLock, "Reader 1", sharedMemory));
        Thread readerThread2 = new Thread(new Reader(rwLock, "Reader 2", sharedMemory));
        Thread readerThread3 = new Thread(new Reader(rwLock, "Reader 3", sharedMemory));

        writerThread1.start();
        writerThread2.start();
        writerThread3.start();

        readerThread1.start();
        readerThread2.start();
        readerThread3.start();
    }
}