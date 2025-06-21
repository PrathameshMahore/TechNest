import java.util.Scanner;

/**
 * Task 2 – Bank Account Management System using OOP
 * Demonstrates Encapsulation, Constructors, and Method Overloading.
 */

class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    // Constructor
    BankAccount(String name, long accNo, double initialBalance) {
        this.accountHolder = name;
        this.accountNumber = accNo;
        this.balance = initialBalance;
    }

    // Deposit Method
    void deposit(double amount) {
        balance += amount;
        System.out.println(" Deposited: ₹" + amount);
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(" Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    // Display Account Info
    void displayDetails() {
        System.out.println("\n=== Account Details ===");
        System.out.println("Holder: " + accountHolder);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Create New Bank Account ===");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        long accNo = sc.nextLong();
        System.out.print("Enter initial balance: ₹");
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(name, accNo, bal);
        acc.displayDetails();

        // Transactions
        acc.deposit(5000);
        acc.withdraw(3000);
        acc.withdraw(15000); // To show insufficient balance
        acc.displayDetails();

        sc.close();
    }
}
