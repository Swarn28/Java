package Threads;

public class PrintOddEven {

    boolean isOdd=true;
    int count=1;

    public void printEven() throws InterruptedException{
        while(true){
            synchronized(this){
                while(isOdd){
                    wait();
                }
                System.out.println("Even " +count);
                count++;
                isOdd=true;
                notify();
                Thread.sleep(1000);
            }
        }
    }
    public void printOdd() throws InterruptedException{
        while(true){
            synchronized(this){
                while(!isOdd){
                    wait();
                }
                System.out.println("Odd " +count);
                count++;
                isOdd=false;
                notify();
                Thread.sleep(1000);

            }
        }
    }
    public static void main(String[] args) {
        final PrintOddEven pe = new PrintOddEven();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                try {
                    pe.printEven();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                try {
                    pe.printOdd();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}