package customModule;

public class Ebook extends AbstractBook{
    
    private double fileSize;

    public Ebook (String title, String author, double price, int quantityAvailable, double fileSize) {
        super(title, author, price, quantityAvailable);
        this.fileSize = fileSize;
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
        return title + " by " + author + " costs $" + price + "of size" + fileSize + " and " + quantityAvailable + " are available.";
    }

}
