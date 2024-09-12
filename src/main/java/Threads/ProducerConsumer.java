package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumer {

    List<Integer> list = new ArrayList<>();

    int counter = 0;

    int capacity = 5;

    public void producer() {
        while (true) {
            synchronized (this) {
                try {
                    while (list.size() == capacity) {
                        System.out.println("Producer is waiting... thread name is: " + Thread.currentThread());
                        wait();
                    }
                    counter++;
                    list.add(counter);
                    System.out.println("Added number to list: " + counter +" thread name is: " + Thread.currentThread());
                    notify();
                    Thread.sleep(1000);
                    // System.out.println("Producer Resumed...");

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void consumer() {
        int i = 0;
        while (true) {
            synchronized (this) {
                if (list.size() == 0) {
                    try {
                        System.out.println("Consumer is waiting... thread name is:" + Thread.currentThread());
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int num = list.remove(i);
                System.out.println("Removed number: " + num + " thread name is: " + Thread.currentThread());
                notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    public static void main(String[] args) {

        ProducerConsumer pc = new ProducerConsumer();

        //ExecuteByNormalWay(pc);

        ExecuteByExecutorService(pc);
    }

    private static void ExecuteByNormalWay(ProducerConsumer pc) {
        System.out.println("Doing by normal way...");
        Thread t1 = new Thread(() -> {
            pc.producer();
        });


        Thread t2 = new Thread(() -> {
            pc.consumer();
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

    private static void ExecuteByExecutorService(ProducerConsumer pc) {

        System.out.println("Doing by ExecutorService way...");

        ExecutorService exec = Executors.newFixedThreadPool(2);

        exec.execute(() -> {
            pc.producer();
        });

        exec.execute(() -> {
            pc.consumer();
        });

        exec.shutdown();
    }

}
