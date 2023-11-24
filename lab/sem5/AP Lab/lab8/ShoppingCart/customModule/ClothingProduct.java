package customModule;

public class ClothingProduct extends AbstractProductClass{

    String Size;

    public ClothingProduct(String name, double Price, int quantityAvailable, String Size) {
        super(name, Price, quantityAvailable);
        this.Size = Size;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public void addToCart() {
        System.out.println("This is the addToCart method from ClothingProduct");
    }

    public void calculateTotalCost() {
        System.out.println("This is the calculateTotalCost method from ClothingProduct");
    }
    
}
