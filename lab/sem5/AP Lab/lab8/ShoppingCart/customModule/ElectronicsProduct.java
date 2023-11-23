package customModule;

public class ElectronicsProduct extends AbstractProductClass{

    int warrantyPeriod;

    public ElectronicsProduct(String name, double Price, int quantityAvailable, int warrantyPeriod) {
        super(name, Price, quantityAvailable);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if (warrantyPeriod > 0) {
            this.warrantyPeriod = warrantyPeriod;
        }
    }

    public void addToCart() {
        System.out.println("This is the addToCart method from ElectronicsProduct");
    }

    public void calculateTotalCost() {
        System.out.println("This is the calculateTotalCost method from ElectronicsProduct");
    }
    
}
