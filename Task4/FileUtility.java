import java.io.*;
import java.util.Scanner;

/**
 * Task 4 – File Handling Utility
 * Reads, writes, and appends to text files using Java I/O.
 */
public class FileUtility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== FILE HANDLING UTILITY ===");
            System.out.print("Enter file name (e.g., sample.txt): ");
            String filename = sc.nextLine();

            // Write
            System.out.print("Enter text to write: ");
            String content = sc.nextLine();
            FileWriter fw = new FileWriter(filename, true); // append mode
            fw.write(content + "\n");
            fw.close();
            System.out.println("Content written successfully.");

            // Read
            System.out.println("\nFile Content:");
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println(" I/O Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
