package ThreadDeadlock;

public class Thread1 extends Thread{
    A a;
    B b;

    public Thread1(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void run(){
        synchronized (a){
            System.out.println("In block A of thread1");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        synchronized (b){
            System.out.println("In block B of thread1");
        }
    }
}
