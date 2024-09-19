
public class bank {
    // Data members
    private String name;
    private double balance;

    // Constructor
    public bank(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Member function to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Member function to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Main method to test the Bank class
    public static void main(String[] args) {
        // Creating an object of Bank
        bank myBank = new bank("My Bank", 1000);

        // Testing deposit and withdraw methods
        myBank.deposit(500);
        myBank.withdraw(200);
        myBank.withdraw(1500); // This should print an error message
    }
}
