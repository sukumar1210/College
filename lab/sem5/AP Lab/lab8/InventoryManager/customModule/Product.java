package customModule;
public class Product{
    private String name;
    private int price;
    private int quantity;
    public Product(String name, int price, int quantity) throws ProductLimitExceededException {
        this.name = name;
        this.price = price;
        if (quantity > 10) {
            throw new ProductLimitExceededException("Quantity cannot be more than 10");
        }
        else this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) throws ProductLimitExceededException {
        if (quantity > 10) {
            throw new ProductLimitExceededException("Quantity cannot be more than 10");
        }
        else this.quantity = quantity;
    }

}