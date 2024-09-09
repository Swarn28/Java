package Practise;

public class Exception_oddNumber {
    public void validateNumber(int num){
        if(num%2==0){
            System.out.println("Num is Even");
        }
        else{
            throw new IllegalArgumentException("number is odd ");
        }

    }

    public static void main(String[] args) {
        Exception_oddNumber oddnum = new Exception_oddNumber();
        int num = 7;
        try{
            oddnum.validateNumber(7);
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception message is " +e.getMessage());
        }
    }
}
