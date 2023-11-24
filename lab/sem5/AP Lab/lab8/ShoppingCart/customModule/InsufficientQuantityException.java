package customModule;

public class InsufficientQuantityException extends Exception {
    public InsufficientQuantityException() {
        super("Insufficient Quantity");
    }
}
