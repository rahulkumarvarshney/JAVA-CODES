// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom exception for invalid amount
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance; 

    
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public boolean withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        } else if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount.");
        } else {
            balance -= amount; 
            System.out.println("Withdrawal successful. Amount withdrawn: " + amount);
            return true; 
        }
    }

    
    public double getBalance() {
        return balance;
    }
    
    
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(1000);

            System.out.println("Initial balance: " + account.getBalance());

            
            account.withdraw(500);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            
            account.withdraw(600);

            
            account.withdraw(-100);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Error: " + e.);
        }
    }
}
