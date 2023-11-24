package customModule;
public interface Book {

    void purchase (int quantity) throws InsufficientBooksException;
    double calculateTotalCost (int quantity);
    String toString ();
}