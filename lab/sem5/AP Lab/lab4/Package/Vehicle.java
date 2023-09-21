package Package;
public class Vehicle {
    protected String brand;
    private String color;
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    public void displayBrand() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
    public void displayInfo(){
        System.out.println("Vehicle Info:");
        System.out.println( "Vehicle Type: " + this.getClass().getSimpleName());
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}
