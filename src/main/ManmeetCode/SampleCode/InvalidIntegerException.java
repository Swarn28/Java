package SampleCode;

import Practise.InvalidStringException;

public class InvalidIntegerException extends Exception{
    public InvalidIntegerException(){
        super();
    }
    public InvalidIntegerException(String message){
        super(message);


    }
}
