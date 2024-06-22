package ThreadDeadlock;

public class Thread2 extends Thread {

    A a;
    B b;

    public Thread2(A a, B b){
        this.a = a;
        this.b = b;
    }

    public void run(){
        synchronized (b){
            System.out.println("In block B of thread2");
        }
        synchronized (a){
            System.out.println("In block A of thread2");
        }
    }
}
