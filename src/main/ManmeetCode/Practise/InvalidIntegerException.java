package Practise;

public class InvalidIntegerException extends Exception {

    // Default constructor
    public InvalidIntegerException() {
        super();
    }

    // Constructor with a custom message
    public InvalidIntegerException(String message) {
        super(message);
    }
}
