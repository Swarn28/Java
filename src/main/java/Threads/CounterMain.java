package Threads;

public class CounterMain {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable r = () ->{
            for(int i =0;i<=99;i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Counter value is : "+c.counter);

    }
}
