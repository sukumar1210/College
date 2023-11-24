package customModule;

import java.util.HashSet;

public class OnlineShoppingCart {
    
    static HashSet<CustomerClass> customers = new HashSet<CustomerClass>();
    static HashSet<AbstractProductClass> products = new HashSet<AbstractProductClass>();

    public void addProduct(AbstractProductClass product) {
        products.add(product);
    }

    public void addCustomer(CustomerClass customer) {
        customers.add(customer);
    }

    public void displayProducts() {
        for (AbstractProductClass product : products) {
            System.out.println(product.toString());
        }
    }

    public void addToCart(CustomerClass customer, AbstractProductClass product, int quantity) {
        try {
            customer.addToCart(product, quantity);
        } catch (InsufficientQuantityException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayCustomers() {
        for (CustomerClass customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void purchase(CustomerClass customer) {
        System.out.println("Bill:");
        customer.displayCart();
        System.out.println("Total Cost: " + customer.calculateTotalCost());
        customer.purchase();
        System.out.println("Thank you for shopping with us!");
        
    }

}
