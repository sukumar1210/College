package Calculator;

public class Calculator {
    public static int calculate(int a, int b, String operator){
        try {
            switch (operator) {
                case "+":
                    return a + b;
                case "-":
                    return a - b;
                case "*":
                    return a * b;
                case "/":
                    return a / b;
                default:
                    throw new IllegalArgumentException("Unknown operator: " + operator);
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
            return 0;
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
            return 0;
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return 0;
        }
    }
}