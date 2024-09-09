package SampleCode;

import Practise.InvalidIntegerException;
import Practise.InvalidStringException;

public class Validate {
    public void validateInput(Object obj, boolean isString) throws InvalidStringException, InvalidIntegerException {
        ValidateInputs vi = new ValidateInputs();
        if(isString){
            vi.validateString(obj);

        }
        else{
            vi.validateInteger(obj);

        }

    }

    public static void main(String[] args) {
        Validate v1 = new Validate();
        Integer num = Integer.valueOf(12345);
        String stringObj = new String("John");
        try{
            v1.validateInput(stringObj, true);
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
    }

}
