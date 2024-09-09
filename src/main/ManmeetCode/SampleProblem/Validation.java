package SampleProblem;

import Practise.InvalidIntegerException;
import Practise.InvalidStringException;
import Practise.ValidateInput;

//To check whether the input is valid String or valid Integer.
public class Validation {
    public void validateInput(Object obj, boolean isString) throws InvalidStringException, InvalidIntegerException {
        ValidateInput vi = new ValidateInput();
        if(isString){
           vi.validateString(obj);
        }
        else{
            vi.validateInteger(obj);
        }


    }

    public static void main(String[] args) {
        Validation v1 = new Validation();
        Integer num = Integer.valueOf(1234);
        String stringobj = new String("John");

        try{
            v1.validateInput(num, false);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
