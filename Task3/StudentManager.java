import java.util.ArrayList;
import java.util.Scanner;

/**
 * Task 3 – Student Record Management
 * Demonstrates use of ArrayList to manage dynamic student data.
 */

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== STUDENT RECORD MANAGER ===");

        System.out.print("How many students? ");
        int count = sc.nextInt();
        sc.nextLine(); // flush

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine(); // flush
            students.add(new Student(roll, name));
        }

        System.out.println("\n Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        sc.close();
    }
}
