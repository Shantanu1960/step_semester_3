package advanced_arrays.assignment_problems;


import java.util.*;

abstract class Vehicle {
    abstract double calc(int hours);
}

class Bike extends Vehicle {
    @Override
    double calc(int hours) {
        return hours * 10;
    }
}

class Car extends Vehicle {
    @Override
    double calc(int hours) {
        return 30 + (hours - 1) * 20;
    }
}

class Truck extends Vehicle {
    @Override
    double calc(int hours) {
        return Math.max(100, hours * 50);
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Vehicle> types = new HashMap<>();
        types.put("BIKE", new Bike());
        types.put("CAR", new Car());
        types.put("TRUCK", new Truck());

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String typ = sc.next();
            int hours = sc.nextInt();

            double charge = types.get(typ).calc(hours);

            System.out.printf("%s: %.2f%n", typ, charge);
            total += charge;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
