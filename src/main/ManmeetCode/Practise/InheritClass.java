package Practise;

public class InheritClass {
    int a, b;
    public void add(int a, int b){
        System.out.println("addition of a+b is " +(a+b));
    }

}

class B extends InheritClass{
    public void add(int a, int b){
        System.out.println("in child...");

    }

    public static void main(String[] args) {
        B b1 = new B();
        b1.caller();
    }

    public void caller(){
      InheritClass b1 = new B();
        b1.add(5,6);
        super.add(5,6);
    }

}
