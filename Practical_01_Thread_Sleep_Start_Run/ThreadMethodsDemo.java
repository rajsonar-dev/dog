class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Child thread: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class ThreadMethodsDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start(); // starts a new thread and calls run()
        t.join();
        System.out.println("Main thread finished");
    }
}
