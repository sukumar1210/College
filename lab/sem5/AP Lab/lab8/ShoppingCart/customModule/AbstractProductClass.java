package customModule;

public abstract class AbstractProductClass implements Product{
    
    private String name;
    private double price;
    private int quantityAvailable;
    
    public AbstractProductClass() {}

    public AbstractProductClass(String name, double price, int quantityAvailable) {
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }
    
    public void addToCart(int quantity) {}
    public void calculateTotalCost(int quantity) {}
    
    public String toString() {
        return "Product: " + name + "\nPrice: " + price + "\nQuantity: " + quantityAvailable + "\nTotal Cost: ";
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantityAvailable;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
    
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantityAvailable = quantity;
        }
    }

    public abstract void addToCart();
    public abstract void calculateTotalCost(); 

}
