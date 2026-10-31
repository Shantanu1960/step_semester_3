package advanced_arrays.class_problems;


import java.util.*;

abstract class Transport {
    abstract double calc(double distance, double factor);
}

class Bus extends Transport {
    double calc(double distance, double factor) {
        return Math.min(2 + 0.10 * distance, 10);
    }
}

class Train extends Transport {
    double calc(double distance, double factor) {
        return 3 + 0.15 * distance;
    }
}

class Metro extends Transport {
    double calc(double distance, double factor) {
        return (1.50 + 0.20 * distance) * factor;
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Transport> types = new HashMap<>();
        types.put("BUS", new Bus());
        types.put("TRAIN", new Train());
        types.put("METRO", new Metro());

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String typ = sc.next();
            double distance = sc.nextDouble();

            double factor = 1;

            if (typ.equals("METRO")) {
                factor = sc.nextDouble();
            }

            double fare = types.get(typ).calc(distance, factor);

            System.out.printf("%s: %.2f%n", typ, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
