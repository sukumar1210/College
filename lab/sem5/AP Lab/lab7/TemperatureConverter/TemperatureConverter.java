package TemperatureConverter;
public class TemperatureConverter {
    public static double F2C(double fahrenheit) throws InvalidTemperature {
        double c = (fahrenheit - 32) * 5 / 9;
        if (c<=-273.15 ) {
            throw new InvalidTemperature("Invalid Temperature Entered");
        }
        return c;
    }
    public static double C2F(double celsius) throws InvalidTemperature {
        double f = celsius * 9 / 5 + 32;
        if (f<=-459.67 ) {
            throw new InvalidTemperature("Invalid Temperature Entered");
        }
        return f;
    }
}
