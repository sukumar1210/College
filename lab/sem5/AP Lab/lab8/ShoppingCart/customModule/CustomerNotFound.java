package customModule;

public class CustomerNotFound extends Exception {
    public CustomerNotFound(String message) {
        super("Customer Not Found");
    }
}
