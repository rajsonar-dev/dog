class Worker extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            if (i == 2) {
                Thread.yield(); // gives other threads a chance to run
            }
            try { Thread.sleep(300); } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
public class SleepYieldDemo {
    public static void main(String[] args) {
        new Worker().start();
        new Worker().start();
    }
}
