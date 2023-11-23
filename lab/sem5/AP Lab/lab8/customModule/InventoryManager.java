package customModule;
import java.util.Scanner;
public class InventoryManager implements InventoryOperations{

    private Product[] products;
    private int count;

    public InventoryManager(int size) {
        products = new Product[size];
        count = 0;
    }

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
        }
    }

    public void removeProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equals(name)) {
                products[i] = products[count - 1];
                count--;
                break;
            }
        }
    }

    public void updateProduct(Product product) {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equals(product.getName())) {
                products[i] = product;
                break;
            }
        }
    }

    public Product getProduct(String name) throws ProductNotFoundException {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equals(name)) {
                return products[i];
            }
        }
        throw new ProductNotFoundException(name + " not found in the Current Inventory");
    }


    public Product[] getProducts() {
        Product[] temp = new Product[count];
        for (int i = 0; i < count; i++) {
            temp[i] = products[i];
        }
        return temp;
    }
    public void displayInventory() {
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getName() + " " + products[i].getPrice() + " " + products[i].getQuantity());
        }
    }
    public class PriceModifier extends ProductModifier{
        public PriceModifier() {}
        public void ModifyProduct(Product p) {
            System.out.println("Enter product price: ");
            Scanner sc = new Scanner(System.in);
            int price = sc.nextInt();
            sc.close();
            try{
                updateProduct(new Product(p.getName(), price, p.getQuantity()));
            } catch (ProductLimitExceededException e) {
                System.out.println(e.getMessage());
            }
        }    
    }
    
    public class QuantityModifier extends ProductModifier{
        public QuantityModifier() {}
        public void ModifyProduct(Product p) {
            System.out.println("Enter product price: ");
            Scanner sc = new Scanner(System.in);
            int quantity = sc.nextInt();
            sc.close();
            try{
                updateProduct(new Product(p.getName(), p.getPrice(), quantity));
            } catch (ProductLimitExceededException e) {
                System.out.println(e.getMessage());
            }
        }    
    }
}
