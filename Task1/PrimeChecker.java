import java.util.Scanner;

/**
 * Task 1 – Prime Number Checker
 * Checks if a number is prime or not.
 */
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PRIME NUMBER CHECKER ===");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime Number" : " Not a Prime Number");
        sc.close();
    }
}
