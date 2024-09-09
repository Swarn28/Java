package Practise;

public class InvalidStringException extends Exception {

    // Default constructor
    public InvalidStringException() {
        super();
    }

    // Constructor with a custom message
    public InvalidStringException(String message) {
        super(message);
    }
}
