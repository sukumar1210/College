package Package;
// import Package.Vehicle;
public class Car extends Vehicle {
    private String model;
    private Integer year;
    public Car(String brand, String model, Integer year, String color) {
        super(brand, color);
        this.model = model;
        this.year=year;
    }
    public void displayCarInfo() {
        System.out.println("Car Info:");
        super.displayBrand();
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}