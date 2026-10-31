package advanced_arrays.assignment_problems;


import java.util.*;
import java.time.*;

abstract class Plan {
    abstract int getDays();
}

class Basic extends Plan {
    @Override
    int getDays() {
        return 30;
    }
}

class Standard extends Plan {
    @Override
    int getDays() {
        return 90;
    }
}

class Premium extends Plan {
    @Override
    int getDays() {
        return 365;
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Plan> types = new HashMap<>();
        types.put("BASIC", new Basic());
        types.put("STANDARD", new Standard());
        types.put("PREMIUM", new Premium());

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String typ = sc.next();
            String name = sc.next();
            LocalDate start = LocalDate.parse(sc.next());

            Plan p = types.get(typ);

            LocalDate renewal = start.plusDays(p.getDays());

            System.out.println(name + ": " + renewal);
        }

        sc.close();
    }
}
