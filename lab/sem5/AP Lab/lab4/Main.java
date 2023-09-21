import Package.*;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2023, "Yellow");
        System.out.println("Car Instance:");
        car.displayCarInfo();
        System.out.println();
        Bicycle bicycle = new Bicycle("Trek", 21, "Red");
        System.out.println("Bicycle Instance:");
        bicycle.displayBicycleInfo();
        System.out.println();
        Vehicle vehicle = new Vehicle("Toyota", "Blue");
        System.out.println("Vehicle Instance:");
        vehicle.displayBrand();
        System.out.println();
        MountainBike mountainBike = new MountainBike("Trek", 21, "Red", "Front");
        System.out.println("MountainBike Instance:");
        mountainBike.displayBicycleInfo();
        System.out.println();
        // System.out.println("Display info:");
        car.displayInfo();
        bicycle.displayInfo();
        vehicle.displayInfo();
        mountainBike.displayInfo();
    }  
}
