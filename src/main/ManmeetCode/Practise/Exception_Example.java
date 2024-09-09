package Practise;
//Handle Arithmetic Exception
public class Exception_Example {
    public void divideNumber(int divident,int divisor){
        if(divisor==0){
            throw new ArithmeticException("Cannot divide the number by 0");
        }

    }

    public static void main(String[] args) {
        Exception_Example exp = new Exception_Example();
        int divident = 5;
        int divisor = 0;
       // exp.divideNumber(5,0);
        try{
            exp.divideNumber(5,0);
        }
        catch(ArithmeticException e){
            System.out.println("Error : " +e.getMessage());
        }
    }
}
