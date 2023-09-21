package Package;

public class MountainBike extends Bicycle {
    public String suspensionType;
    public MountainBike(String brand, int gears, String color, String suspensionType){
        super(brand, gears, color);
        this.suspensionType = suspensionType;
    }
    public void displayBicycleInfo() {
        super.displayBrand();
        System.out.println("Suspention Type: " + this.suspensionType);
    }
}
