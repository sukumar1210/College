import java.util.Scanner;
import customModule.*;
public class Main {
    public static void main(String[] args) {
        int ch;
        InventoryManager inventoryManager = new InventoryManager(10);
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product");
            System.out.println("4. Get Product");
            System.out.println("5. Get All Products");
            System.out.println("6. Make Sale");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            String name;
            int price, quantity;
            switch (ch) {
                case 1:
                    System.out.println("Enter product name: ");
                    name = sc.next();
                    System.out.println("Enter product price: ");
                    price = sc.nextInt();
                    System.out.println("Enter product quantity: ");
                    quantity = sc.nextInt();
                    try {
                        inventoryManager.addProduct(new Product(name, price, quantity));
                    } catch (ProductLimitExceededException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter product name: ");
                    name = sc.next();
                    inventoryManager.removeProduct(name);
                    break;
                case 3:
                    System.out.println("Enter product name: ");
                    name = sc.next();
                    System.out.println("Enter product price: ");
                    price = sc.nextInt();
                    System.out.println("Enter product quantity: ");
                    quantity = sc.nextInt();
                    try {
                        // InventoryManager.PriceModifier priceModifier = inventoryManager.new PriceModifier();
                        // priceModifier.ModifyProduct(new Product(name, price, quantity));
                        inventoryManager.updateProduct(new Product(name, price, quantity));
                    } catch (ProductLimitExceededException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Enter product name: ");
                    name = sc.next();
                    try{
                        System.out.println("Found" + inventoryManager.getProduct(name).getName() + "in the Inventory");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    inventoryManager.displayInventory();
                    break;
                case 6:
                    String productName;
                    int productQuantity;
                    System.out.println("Enter product name: ");
                    productName = sc.next();
                    System.out.println("Enter product quantity: ");
                    productQuantity = sc.nextInt();
                    try{
                        inventoryManager.recordSale(productName, productQuantity);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.err.println(inventoryManager.calculateDailyRevenue());
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        // try {
        //     inventoryManager.addProduct(new Product("Apple", 10, 5));
        //     inventoryManager.addProduct(new Product("Orange", 20, 10));
        //     inventoryManager.addProduct(new Product("Banana", 30, 5));
        //     inventoryManager.addProduct(new Product("Grapes", 40, 7));
        //     inventoryManager.addProduct(new Product("Mango", 50, 7));
        //     inventoryManager.addProduct(new Product("Pineapple", 60, 3));
        //     inventoryManager.addProduct(new Product("Watermelon", 70, 8));
        //     inventoryManager.addProduct(new Product("Kiwi", 80, 4));
        //     inventoryManager.addProduct(new Product("Papaya", 90, 9));
        //     inventoryManager.addProduct(new Product("Guava", 100, 5));
            
        //     // will throw an exception
        //     inventoryManager.addProduct(new Product("Strawberry", 110, 11));
        
        // } catch (ProductLimitExceededException e) {
        //     System.out.println(e.getMessage());
        // }
        // inventoryManager.displayInventory();
    }
}
