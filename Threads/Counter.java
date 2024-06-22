package Threads;

public class Counter{

    int counter = 0;

    public void  increment(){
        counter++;
    }

    public void showCounter(){
        System.out.println(counter);
    }

    public void process() throws InterruptedException {
        Runnable r = () -> {
            for (int i = 0; i <= 99; i++) {
                increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();

        t2.start();

        t3.start();
        System.out.println("Active thread count is : "+Thread.activeCount());


        t1.join();
        t2.join();
        t3.join();

        System.out.println("Counter value is : "+counter);

    }

        public static void main(String[] args) throws InterruptedException {

            Counter c = new Counter();

            c.process();




        }

}
