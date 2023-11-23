package customModule;

public interface InventoryOperations {
    public void addProduct(Product product);
    public void removeProduct(String name);
    public void updateProduct(Product product);
    public Product getProduct(String name) throws ProductNotFoundException;
    public Product[] getProducts(); 
}
