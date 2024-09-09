package Demos;

public class Step1 {

    public void method1() throws SelfException, SelfException2{
        Step2 s2 = new Step2();
        s2.method12();
        s2.method13();
        s2.method14();
    }

    public static void main(String[] args) {
        Step1 s1 = new Step1();

        try {
            s1.method1();
        } catch (SelfException | SelfException2 e1) {
          //  Error.log("Exception occurred" + e.getMessage());
        }
    }

}
