package SampleProblem;

import Practise.InvalidIntegerException;
import Practise.InvalidStringException;

public class ValidateInput {
    public void validateString(Object obj) throws InvalidStringException{
        if(true){
            System.out.println("Valid String");
        }
        else{
            throw new InvalidStringException("Invalid String");
        }

    }

    public void validateInteger(Object obj) throws InvalidIntegerException{
        if(true){
            System.out.println("Valid Integer");
        }
        else{
            throw new InvalidIntegerException("Invalid Integer");
        }
    }
}
