//File Player.java

public class Player {
    
    /*
        this code represent a player character in a game

        the code includes:
        1. storing the player's attributes (name, healt, power, defgense)
        2. method/function to attack and take damage from the enemy
        3. adjusting the health based on the damage received
        4. display the messages in the battle
     */


    // attribute for player
    private String name;
    private int health;
    private int power;
    private int defense;
    
    // initialize the player's attributes
    public Player(String name, int health, int power, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }
    
    // getter for name, health, power, and defense
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getPower() {
        return power;
    }
    public int getDefense() {
        return defense;
    }
    
    // setter for health
    public void setHealth(int health) {
        this.health = health;
    }

    // function for attacking the enemy
    public void attack(Enemy enemy) {
        System.out.println(this.name + " attacks " + enemy.getName() + " with power " + this.power);
        enemy.takeDamage(this.power); 
        // send enemy's attack to enemy's take damage 
    }
    
        // function to take damage from the enemy
        public void takeDamage(int attackPower) {
        int damage = attackPower - this.defense;

        // ensure there would be no negative damage 
        damage = (damage > 0) ? damage : 0; 
        this.health -= damage;

        // if the health after taking damage is negative, set the health to 0 (for display purpose)
        if (this.health < 0) {
            this.health = 0; 
        }
        System.out.println(this.name + " takes " + damage + " damage. Health now: " + this.health);
        if (this.health == 0) {
            System.out.println(this.name + " died!");
        }
    }

}
