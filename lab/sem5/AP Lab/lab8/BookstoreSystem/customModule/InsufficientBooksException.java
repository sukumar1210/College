package customModule;

public class InsufficientBooksException extends Exception {
    public InsufficientBooksException (String message) {
        super("Insufficient Books");
    }
}
