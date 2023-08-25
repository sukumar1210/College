package Package;
public class Vehicle {
    protected String brand, color;
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    public void displayBrand() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}
