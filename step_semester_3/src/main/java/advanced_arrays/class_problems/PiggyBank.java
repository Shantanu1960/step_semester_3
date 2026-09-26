package advanced_arrays.class_problems;

public class PiggyBank {
    private final String id;
    private double savings;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0;
    }

    public String getId() {
        return id;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive");
            return;
        }

        savings += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive");
            return;
        }

        if (amount > savings) {
            System.out.println("Withdrawal rejected: insufficient savings");
            return;
        }

        savings -= amount;
    }

    public double getSavings() {
        return savings;
    }
}