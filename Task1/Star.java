import java.util.Scanner;

/**
 * Task 1 – Pattern Printing
 * Prints a triangle star pattern.
 */
public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== STAR PATTERN PRINTER ===");
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int s = rows - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}
