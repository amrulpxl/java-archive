import java.util.concurrent.TimeUnit;

public class Threads {
    public static void main(String[] args) {
        Thread thread1 = new CustomThread();
        thread1.start();
        Thread thread2 = new Thread(new CustomRunnable());
        thread2.start();

        Thread thread3 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Lambda Thread: " + i);
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Lambda thread interrupted: " + e.getMessage());
            }
        });
        thread3.start();

        System.out.println("thread 3 is alive: " + thread3.isAlive());
        System.out.println("thread 3 name: " + thread3.getName());
        System.out.println("thread 3 priority: " + thread3.getPriority());

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            System.out.println("all threads passed!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("main thread interrupted: " + e.getMessage());
        }
    }
}

class CustomThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Custom Thread: " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("custom thread interrupted: " + e.getMessage());
        }
    }
}

class CustomRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Custom Runnable: " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("custom runnable interrupted: " + e.getMessage());
        }
    }
}
