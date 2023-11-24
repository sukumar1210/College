import Calculator.Calculator;
import BankingSystem.*;
import LibraryCatalogManagement.*;
import TemperatureConverter.TemperatureConverter;
public class Main {
    public static void main(String[] args) {
        // Calculator System
        
        System.out.println("Calculator System");
        System.out.println("Addition: " + Calculator.calculate(1, 2, "+"));
        System.out.println("Subtraction: " + Calculator.calculate(1, 2, "-"));
        System.out.println("Multiplication: " + Calculator.calculate(1, 2, "*"));
        System.out.println("Division: " + Calculator.calculate(1, 2, "/"));

        // Banking System
        System.out.println("\nBanking System");
        Bank bank = new Bank();
        bank.addAccount("John Doe", 1000);
        bank.addAccount("Jane Doe", 2000);
        bank.addAccount("John Smith", 3000);
        bank.addAccount("Jane Smith", 4000);
        try {
            bank.getAccount(0);
            bank.getAccount(1);
            bank.getAccount(2);
            bank.getAccount(3);
            bank.transfer(0, 2, 700);
            bank.getAccount(0);
            bank.getAccount(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Library Catalog Management System
        System.out.println("\nLibrary Catalog Management System");
        Book book = new Book("The Lord of the Rings", "J. R. R. Tolkien", 2);
        try {
            book.checkoutBook();
            book.checkoutBook();
            book.checkoutBook();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Temperature Converter System
        System.out.println("\nTemperature Converter System");
        try {
            System.out.println("Celsius to Fahrenheit: " + TemperatureConverter.C2F(0));
            System.out.println("Fahrenheit to Celsius: " + TemperatureConverter.F2C(32));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
