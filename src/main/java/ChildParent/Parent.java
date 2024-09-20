package ChildParent;

public class Parent implements  ParentInterface{


    @Override
    public void go() {
        System.out.println("Interview");
    }

    public static void main(String[] args) {
        Parent p = new ChildTwo();
        ChildTwo c = new ChildTwo();
        p.go();
        c.go3();
    }
}
