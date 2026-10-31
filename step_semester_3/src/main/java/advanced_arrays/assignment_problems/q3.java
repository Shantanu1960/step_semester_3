package advanced_arrays.assignment_problems;


import java.util.*;

abstract class Room {
    abstract double calc();
}

class Single extends Room {
    int units;

    Single(int units) {
        this.units = units;
    }

    @Override
    double calc() {
        return units * 8;
    }
}

class Shared extends Room {
    int units, occupants;

    Shared(int units, int occupants) {
        this.units = units;
        this.occupants = occupants;
    }

    @Override
    double calc() {
        return (units * 6.0) / occupants;
    }
}

class AC extends Room {
    int units;

    AC(int units) {
        this.units = units;
    }

    @Override
    double calc() {
        return units * 10 + 200;
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Room[] rooms = new Room[n];

        for (int i = 0; i < n; i++) {
            String typ = sc.next();
            int units = sc.nextInt();

            if (typ.equals("SINGLE")) {
                rooms[i] = new Single(units);
            } else if (typ.equals("SHARED")) {
                int occupants = sc.nextInt();
                rooms[i] = new Shared(units, occupants);
            } else {
                rooms[i] = new AC(units);
            }
        }

        double total = 0;

        for (Room r : rooms) {
            double bill = r.calc();

            System.out.printf("%.2f%n", bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
