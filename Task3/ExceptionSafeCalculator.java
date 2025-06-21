import java.util.Scanner;

/**
 * Task 3 – Calculator with Exception Handling
 * Handles divide-by-zero and invalid input gracefully.
 */

public class ExceptionSafeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== EXCEPTION-SAFE CALCULATOR ===");
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.print("Enter operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result;
            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/':
                    if (b == 0) throw new ArithmeticException("Division by zero!");
                    result = a / b;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator!");
            }

            System.out.println(" Result: " + result);

        } catch (Exception e) {
            System.out.println("⚠Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println(" Program ended.");
        }
    }
}
