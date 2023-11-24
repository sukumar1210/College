package customModule;

import java.util.HashMap;

public class CustomerClass {
    
    String name;
    String email;
    HashMap<AbstractProductClass, Integer> cart = new HashMap<AbstractProductClass, Integer>();

    public CustomerClass(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return "Customer Name: " + name + "\nCustomer Email: " + email + "\nCart: " + cart;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public void addToCart(AbstractProductClass product, int quantity) throws InsufficientQuantityException {
        try {
            if(product.getQuantity() < quantity) {
                throw new InsufficientQuantityException();
            }
            if (cart.containsKey(product)) {
                cart.put(product, cart.get(product) + quantity);
            } else {
                cart.put(product, quantity);
            }
        } catch (InsufficientQuantityException e) {
            System.out.println(e.getMessage());
        }
        product.setQuantity(product.getQuantity() - quantity);
    }

    public void displayCart() {
        for (AbstractProductClass product : cart.keySet()) {
            System.out.println(product.toString() + product.getPrice() * cart.get(product));
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (AbstractProductClass product : cart.keySet()) {
            totalCost += product.getPrice() * cart.get(product);
        }
        return totalCost;
    }

    public void purchase(){
        cart.clear();
    }

}
