package SampleCode;

public class InvalidStringException extends Exception {
    public InvalidStringException(String message){
        super(message);
    }

    public InvalidStringException(){
        super();
    }

}
