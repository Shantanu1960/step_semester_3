package advanced_arrays.class_problems;


import java.util.*;

abstract class Question {
    abstract double grade(String correct, String student, double points);
}

class MCQ extends Question {
    double grade(String correct, String student, double points) {
        return correct.equals(student) ? points : 0;
    }
}

class TF extends Question {
    double grade(String correct, String student, double points) {
        return correct.equals(student) ? points : 0;
    }
}

class Essay extends Question {
    double grade(String correct, String student, double points) {
        String[] words = correct.split(",");
        int count = 0;

        for (String word : words) {
            if (student.toLowerCase().contains(word.trim().toLowerCase())) {
                count++;
            }
        }

        if (count >= 2)
            return points * 0.75;
        else if (count == 1)
            return points * 0.50;

        return 0;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Question> types = new HashMap<>();
        types.put("MCQ", new MCQ());
        types.put("TF", new TF());
        types.put("ESSAY", new Essay());

        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            String[] parts = line.split("\"");

            String typ = parts[0].trim();
            String correct = parts[2].trim();
            String student = parts[4].trim();
            double points = Double.parseDouble(parts[5].trim());

            double score = types.get(typ).grade(correct, student, points);

            System.out.printf("%s: %.2f%n", typ, score);
            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);
        sc.close();
    }
}
