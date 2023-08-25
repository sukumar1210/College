import Package.*;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2023, "Yellow");
        car.displayCarInfo();
        System.out.println();
        Bicycle bicycle = new Bicycle("Trek", 21, "Red");
        bicycle.displayBicycleInfo();
    }  
}
