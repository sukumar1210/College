package TemperatureConverter;

public class InvalidTemperature extends Exception{
    public InvalidTemperature(String message) {
        super("Invalid Temperature Entered");
    }
}
