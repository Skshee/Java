class Counter {
    private int count = 0;

    public void increment() {
        count++;  // Not synchronized
    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadInterferenceExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create two threads
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

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
        System.out.println("Final Counter Value (Without Synchronization): " + counter.getCount());
    }
}
