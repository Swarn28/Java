package Demos;

public class Step2 {


    public void method12(){
        System.out.println("MEthod 12");
    }

    public void method13() throws SelfException, SelfException2{
        System.out.println("MEthod 13");

        if(true){
            throw new SelfException("Error");
        }
        else{
            throw new SelfException2("Error 2");
        }

    }

    public void method14(){
        System.out.println("MEthod 14");
    }

}
