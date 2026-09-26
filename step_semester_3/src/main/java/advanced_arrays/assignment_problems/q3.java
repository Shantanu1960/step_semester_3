package advanced_arrays.assignment_problems;

public class q3 {

    public static void main(String[] args) {
        PasswordChecker shortPassword = new PasswordChecker("abcd");
        PasswordChecker mediumPassword = new PasswordChecker("abcdefgh");
        PasswordChecker strongPassword = new PasswordChecker("abcdefghijkl");

        System.out.println("Short password strength: " + shortPassword.getStrength());
        System.out.println("Medium password strength: " + mediumPassword.getStrength());
        System.out.println("Strong password strength: " + strongPassword.getStrength());
    }
}