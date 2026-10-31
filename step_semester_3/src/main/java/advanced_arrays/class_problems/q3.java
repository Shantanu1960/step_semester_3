package advanced_arrays.class_problems;


import java.util.*;

abstract class Delivery {
    abstract double calc(double weight, double distance, double customs);
}

class Standard extends Delivery {
    double calc(double weight, double distance, double customs) {
        return 5 + 0.50 * weight + 0.10 * distance;
    }
}

class Express extends Delivery {
    double calc(double weight, double distance, double customs) {
        return 15 + 1.00 * weight + 0.20 * distance;
    }
}

class International extends Delivery {
    double calc(double weight, double distance, double customs) {
        return 25 + 2.00 * weight + 0.50 * distance + customs;
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Delivery> types = new HashMap<>();
        types.put("STANDARD", new Standard());
        types.put("EXPRESS", new Express());
        types.put("INTERNATIONAL", new International());

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String typ = sc.next();
            double weight = sc.nextDouble();
            double distance = sc.nextDouble();

            double customs = 0;

            if (typ.equals("INTERNATIONAL")) {
                customs = sc.nextDouble();
            }

            double fee = types.get(typ).calc(weight, distance, customs);

            System.out.printf("%s: %.2f%n", typ, fee);
            total += fee;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
