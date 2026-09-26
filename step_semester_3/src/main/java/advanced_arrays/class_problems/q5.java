package advanced_arrays.class_problems;

public class q5 {

    static class Student {
        String name;
        int attendance;
        static String collegeName = "SRM Institute of Science and Technology";
        static int studentCount;

        Student(String name, int attendance) {
            this.name = name;
            this.attendance = attendance;
            studentCount++;
        }

        static void printCollegeInfo() {
            System.out.println(collegeName);
            System.out.println("Students created: " + studentCount);
        }
    }

    public static void main(String[] args) {
        new Student("Ravi", 90);
        new Student("Anitha", 95);

        Student.printCollegeInfo();
    }
}