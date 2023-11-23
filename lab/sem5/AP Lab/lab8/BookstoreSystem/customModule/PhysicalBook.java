package customModule;

public class PhysicalBook extends AbstractBook {
    
    double weight;

    public PhysicalBook (String title, String author, double price, int quantityAvailable, double weight) {
        super(title, author, price, quantityAvailable);
        this.weight = weight;
    }

    public void purchase (int quantity) throws InsufficientBooksException {
        if (quantity > quantityAvailable) {
            throw new InsufficientBooksException("Insufficient Books");
        }
        quantityAvailable -= quantity;
    }
    public double calculateTotalCost (int quantity) {
        return quantity * price;
    }
    public String toString () {
        return title + " by " + author + " costs $" + price + " and " + quantityAvailable + " are available.";
    }

}
