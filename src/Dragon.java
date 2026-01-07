public class Dragon {
    private int health;
    private int strength;
    private int level;
    private boolean dead;
    private int attackDamage;

    public Dragon() {
        health = 100;
        strength = 1;
        level = 1;
        dead = false;
        attackDamage = 0;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDead() {
        return dead;
    }

    public void takeDamage(int amount){
        if (!dead) {
            health = health - amount;
            if (health < 0) {
                health = 0;
            }
            System.out.println("The dragon takes " + amount + " damage and now has " + health + " health.");
            if (health <= 0) {
                dead = true;
                System.out.println("The dragon has been slayed!");
                health = 0;
            }
        } else {
            System.out.println("The dragon is already dead!");
        }
    }

    public int attack() {
        int attackAmt = strength * level;
        System.out.println("The dragon attacks for " + attackAmt + " health!");
        attackDamage += attackAmt;
        if (attackDamage >= 50) {
            level++;
            System.out.println("The dragon has reached level " + level + "!");
            attackDamage = 0;
        }
        return attackAmt;
    }

    public void powerUp(int power) {
        if (power == 1) {
            health *= 2;
            System.out.println("The dragon's health has increased to " + getHealth() + "!");
        } else if (power == 2) {
            strength *= 2;
            System.out.println("The dragon's strength has increased to " + getStrength() + "!");
        }
    }

    public String state() {
        return "Dragon: \nStrength = " + strength + "\nHealth = " + health + "\nLevel = " + level + "\nDead = " + dead + "\nAttack Damage = " + attackDamage;
    }
}