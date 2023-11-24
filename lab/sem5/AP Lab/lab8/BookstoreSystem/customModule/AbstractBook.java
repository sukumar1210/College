package customModule;

public abstract class AbstractBook implements Book {
    String title;
    String author;
    double price;
    int quantityAvailable;

    public AbstractBook (String title, String author, double price, int quantityAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    // public void purchase (int quantity) throws InsufficientBooksException {
    //     if (quantity > quantityAvailable) {
    //         throw new InsufficientBooksException("Insufficient Books");
    //     }
    //     quantityAvailable -= quantity;
    // }

    // public double calculateTotalCost (int quantity) {
    //     return quantity * price;
    // }

    public String toString () {
        return title + " by " + author + " costs $" + price + " and " + quantityAvailable + " are available.";
    }
    public abstract void purchase(int quantity) throws InsufficientBooksException;
    public abstract double calculateTotalCost(int quantity);

}
