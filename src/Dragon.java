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

    public void takeDamage(int amount){
        if (!dead) {
            health = health - amount;
            System.out.println("The dragon takes" + amount + "damage and now has" + health + "health");
            if (health <= 0) {
                dead = true;
                System.out.println("The dragon has been slayed!");
                health = 0;
            }
        }
        System.out.println("The dragon is already dead!");
    }



    public int attack() {
        int attackAmt = strength * level;
        System.out.println("The dragon attacks for " + attackAmt + " health points!");
        attackDamage += attackAmt;
        if (attackDamage >= 50) {
            level++;
            System.out.println("The dragon has reached level " + level + "!");
            attackDamage = 0;
        }
        return attackAmt;
    }
}