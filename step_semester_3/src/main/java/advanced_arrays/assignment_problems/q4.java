package advanced_arrays.assignment_problems;


import java.util.*;

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calc();
}

class FullTime extends Employee {
    FullTime(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calc() {
        return salary * 0.10;
    }
}

class PartTime extends Employee {
    PartTime(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calc() {
        return salary * 0.05;
    }
}

class Intern extends Employee {
    Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calc() {
        return 2000;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Employee> types = new HashMap<>();

        int n = sc.nextInt();
        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            String typ = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            if (typ.equals("FULLTIME")) {
                emp[i] = new FullTime(name, salary);
            } else if (typ.equals("PARTTIME")) {
                emp[i] = new PartTime(name, salary);
            } else {
                emp[i] = new Intern(name, salary);
            }
        }

        double total = 0;

        for (Employee e : emp) {
            double bonus = e.calc();

            System.out.printf("%s: %.2f%n", e.name, bonus);
            total += bonus;
        }

        System.out.printf("Total Bonus: %.2f%n", total);
        sc.close();
    }
}
