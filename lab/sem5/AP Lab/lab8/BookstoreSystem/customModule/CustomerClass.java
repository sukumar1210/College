package customModule;

import java.util.HashMap;

public class CustomerClass {
    String name;
    String email;
    HashMap<AbstractBook, Integer> boughtBooks = new HashMap<AbstractBook, Integer>();

    public CustomerClass (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void purchase(AbstractBook book, int quantity) throws InsufficientBooksException {
        if (quantity > book.quantityAvailable) {
            throw new InsufficientBooksException("Insufficient Books");
        }
        if (boughtBooks.containsKey(book)) {
            boughtBooks.put(book, boughtBooks.get(book) + quantity);
        } else {
            boughtBooks.put(book, quantity);
        }
        book.quantityAvailable -= quantity;
    }
    public double calculateTotalCost(AbstractBook book, int quantity) {
        return quantity * book.price;
    }

}
