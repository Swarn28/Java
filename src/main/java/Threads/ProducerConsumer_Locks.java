package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer_Locks {

    int count = 0;
    int limit = 5;
    Lock lock = new ReentrantLock();
    Condition cond = lock.newCondition();
    List<Integer> numList = new ArrayList<>();

    public void producer() throws InterruptedException {
       try{
        while(true) {
            lock.lock();
            while (numList.size() == limit) {
                System.out.println("Producer waiting...");
                cond.await();
            }
            numList.add(count);
            count++;
            System.out.println("Number added to list: " + count);
            Thread.sleep(500);
            cond.signal();
        }
        }
       finally{
           lock.unlock();
       }
    }

    public void consumer() throws InterruptedException {
       try {
           while (true) {
               lock.lock();
               while (numList.size() == 0) {
                   System.out.println("Consumer Waiting...");
                   cond.await();
               }
               int val = numList.remove(0);
               System.out.println("removed item from list: " + val);
               Thread.sleep(500);
               cond.signal();
           }
       }
       finally {
           lock.unlock();
       }
    }

    public static void main(String[] args) {
        ProducerConsumer_Locks pcl = new ProducerConsumer_Locks();

        Thread t1 = new Thread(()->{
            try {
                pcl.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                pcl.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
