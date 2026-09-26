package advanced_arrays.assignment_problems;

public class q1 {

    public static void main(String[] args) {
        Character character = new Character(100);

        character.takeDamage(30);
        System.out.println("Health after damage: " + character.getHealth());

        character.heal(50);
        System.out.println("Health after healing: " + character.getHealth());

        character.takeDamage(150);
        System.out.println("Final health: " + character.getHealth());
    }
}