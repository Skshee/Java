class SynchronizedCounter {
    private int count = 0;

    // Synchronized method to prevent thread interference
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MySafeThread extends Thread {
    private SynchronizedCounter counter;

    public MySafeThread(SynchronizedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();

        // Create two threads
        MySafeThread thread1 = new MySafeThread(counter);
        MySafeThread thread2 = new MySafeThread(counter);

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Display the final count
        System.out.println("Final Counter Value (With Synchronization): " + counter.getCount());
    }
}