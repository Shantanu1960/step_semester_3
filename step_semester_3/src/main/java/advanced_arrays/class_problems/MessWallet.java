package advanced_arrays.class_problems;

public class MessWallet {
    private double balance;

    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: negative opening balance; starting at 0.0");
            this.balance = 0;
        } else {
            this.balance = openingBalance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be positive");
            return;
        }

        balance += amount;
    }

    public void deduct(double amount) {
        if (amount <= 0) {
            System.out.println("Deduct rejected: amount must be positive");
            return;
        }

        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
            return;
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}