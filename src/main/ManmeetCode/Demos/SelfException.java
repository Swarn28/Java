package Demos;

public class SelfException extends Exception {

    // Default constructor
    public SelfException() {
        super();
    }

    // Constructor with a custom message
    public SelfException(String message) {
        super(message);
    }
}
