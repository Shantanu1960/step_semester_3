package advanced_arrays.assignment_problems;


import java.util.*;

abstract class Customer {
    abstract double calc(double amount);
}

class Student extends Customer {
    @Override
    double calc(double amount) {
        return amount * 0.90;
    }
}

class Staff extends Customer {
    @Override
    double calc(double amount) {
        return amount * 0.95;
    }
}

class Guest extends Customer {
    @Override
    double calc(double amount) {
        return amount + 10;
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Customer> types = new HashMap<>();
        types.put("STUDENT", new Student());
        types.put("STAFF", new Staff());
        types.put("GUEST", new Guest());

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
