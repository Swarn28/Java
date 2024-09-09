package Practise;

public class Validation {

    public void validateInput(Object obj, boolean isString) throws
            InvalidStringException, InvalidIntegerException{
        ValidateInput vi = new ValidateInput();
        if(isString){
            vi.validateString(obj);
        }
        else{
            vi.validateInteger(obj);
        }

    }

    public static void main(String[] args) {
        Validation V1 = new Validation();
        Integer intNum = Integer.valueOf(23);
        String stringObj = new String("abc");
        try {
            V1.validateInput(stringObj, true);
        }
        catch(Exception e){
            System.out.println("Exception Message is : " +e.getMessage());
        }
    }
}
