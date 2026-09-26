package advanced_arrays.assignment_problems;

public class Character {
    private final int maxHealth;
    private int health;

    public Character(int maxHealth) {
        if (maxHealth < 0) {
            throw new IllegalArgumentException("Maximum health cannot be negative");
        }

        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        if (amount < 0) {
            System.out.println("Damage rejected: amount cannot be negative");
            return;
        }

        health = Math.max(0, health - amount);
    }

    public void heal(int amount) {
        if (amount < 0) {
            System.out.println("Healing rejected: amount cannot be negative");
            return;
        }

        health = (int) Math.min(maxHealth, (long) health + amount);
    }

    public int getHealth() {
        return health;
    }
}