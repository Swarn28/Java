package Demos;

public class SelfException2 extends Exception {

    // Default constructor
    public SelfException2() {
        super();
    }

    // Constructor with a custom message
    public SelfException2(String message) {
        super(message);
    }
}
