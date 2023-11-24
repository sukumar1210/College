package LibraryCatalogManagement;

public class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super("Book is currently unavailable");
    }
}
