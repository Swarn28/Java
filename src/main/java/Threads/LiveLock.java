package Threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLock {

    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            while (true) {
                lock1.lock();
                System.out.println("Taken lock 1 by t1...");

                boolean received = false;
                try {
                    received = lock2.tryLock(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (received) {
                    System.out.println("Taken lock 2 by t1...");
                } else {
                    System.out.println("Cannot take lock2.. releasing lock 1 by t1");
                    lock1.unlock();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                lock2.lock();
                System.out.println("Taken lock 2 by t2...");

                boolean received = false;
                try {
                    received = lock1.tryLock(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (received) {
                    System.out.println("Taken lock 1 by t2...");
                } else {
                    System.out.println("Cannot take lock1.. releasing lock 2 by t2");
                    lock2.unlock();
                }
            }
        });

        t1.start();
        t2.start();
    }


}
