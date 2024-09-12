package Threads;

// In this example thread deadlock has occurred because the nested synchronised blocks of each thread are in different orders.
// If we want to remove the deadlock the order of accessing the locks must be same for nested synchronised in 2 threads.


public class DeadLock {

    public static void main(String[] args) {
        Object A = new Object();
        Object B = new Object();

            Thread t1 = new Thread(() -> {
                synchronized (A){
                    try {
                        System.out.println("Inside T1, A Lock....");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    synchronized (B){
                        try {
                            System.out.println("Inside T1, B Lock....");
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            });

        Thread t2 = new Thread(() -> {
            synchronized (B){
                try {
                    System.out.println("Inside T2, B Lock....");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (A){
                    try {
                        System.out.println("Inside T2, A Lock....");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        t1.start();
        t2.start();

    }


}

