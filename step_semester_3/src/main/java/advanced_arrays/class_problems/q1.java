package advanced_arrays.class_problems;
import java.util.*;

abstract class Payment {
    abstract double calc(double amount);
}

class Card extends Payment {
    double calc(double amount) {
        return amount * 1.02;
    }
}

class Wallet extends Payment {
    double calc(double amount) {
        return amount * 1.01;
    }
}

class BankTransfer extends Payment {
    double calc(double amount) {
        return amount;
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Payment> types = new HashMap<>();
        types.put("CARD", new Card());
        types.put("WALLET", new Wallet());
        types.put("BANKTRANSFER", new BankTransfer());

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String typ = sc.next();
            double amount = sc.nextDouble();

            double ans = types.get(typ).calc(amount);

            System.out.printf("%s: %.2f%n", typ, ans);
            total += ans;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
