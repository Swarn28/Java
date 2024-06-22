package ThreadDeadlock;

public class MainClass {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Thread1 t1 = new Thread1(a,b);
        Thread t2 = new Thread2(a,b);

        t1.start();
        t2.start();

    }
}
