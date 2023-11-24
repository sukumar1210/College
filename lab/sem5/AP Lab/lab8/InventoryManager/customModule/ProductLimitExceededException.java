package customModule;

public class ProductLimitExceededException extends Exception {
    public ProductLimitExceededException(String message) {
        super(message);
    }
}
