class Counter {
    synchronized void printCount() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
class CounterThread extends Thread {
    Counter c;
    CounterThread(Counter c, String name) { super(name); this.c = c; }
    public void run() { c.printCount(); }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        Counter c = new Counter();
        new CounterThread(c, "Thread 1").start();
        new CounterThread(c, "Thread 2").start();
    }
}
