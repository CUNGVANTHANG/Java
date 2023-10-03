class ThreadTwo extends Thread {
    String name;

    public ThreadTwo (String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " >> " + i);
        }
    }
}

// Runnable là 1 interface
class ThreadThree implements Runnable {
    String name;

    public ThreadThree (String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " >> " + i);
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        // Cách 1:
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Gọi tới xử lý code trong phần này => Khi mà t1.start() được gọi
                for (int i = 0; i < 10; i++) {
                    System.out.println("t1 >> " + i);
                }
            }
        });

        t1.start();

        // Cách 2: Tạo class ThreadTwo extends Thread
        Thread t2 = new ThreadTwo("t2");

        t2.start();

        // Cách 3: Tạo ra class ThreadThree implements Runnable
        ThreadThree r = new ThreadThree("t3");
        Thread t3 = new Thread(r);
        t3.start();

        // Main Thread
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread >> " + i);
        }
    }
}
