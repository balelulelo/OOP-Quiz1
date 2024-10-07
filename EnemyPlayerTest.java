//File EnemyPlayerTest.java

import java.util.Scanner;

public class EnemyPlayerTest {

    /*
        this code is a testing environment for both enemy and player

        this code involves:
        1. take input from user for enemy and player
        2. create an object (enemy and player) using the user input
        3. simulating the combat with the player starts first, continued by the enemy
        4. display the messages throughout the combat
     */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // insert player attributes
        System.out.print("Enter player's name: ");
        String playerName = input.nextLine();
        System.out.print("Enter player's health: ");
        int playerHealth = input.nextInt();
        System.out.print("Enter player's attack power: ");
        int playerAttack = input.nextInt();
        System.out.print("Enter player's defense: ");
        int playerDefense = input.nextInt();
        input.nextLine();

        // insert enemy's attributes
        System.out.print("Enter enemy's name: ");
        String enemyName = input.nextLine();
        System.out.print("Enter enemy's health: ");
        int enemyHealth = input.nextInt();
        System.out.print("Enter enemy's attack power: ");
        int enemyAttack = input.nextInt();
        System.out.print("Enter enemy's defense: ");
        int enemyDefense = input.nextInt();

        // create an object (enemy and player) using the user input
        Player player = new Player(playerName, playerHealth, playerAttack, playerDefense);
        Enemy enemy = new Enemy(enemyName, enemyHealth, enemyAttack, enemyDefense);

        // begin combat untill either enemy or player is defeated
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            
            //player begins to attack enemy
            player.attack(enemy);
            if (enemy.getHealth() > 0) {
                
                // if enemy is still alive, attack player
                
                enemy.attack(player);

                // continue until one of them is defeated
            }
        }

        // condition to determine which one has been defeated
        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " has been defeated!");
        } else {
            System.out.println(enemy.getName() + " has been defeated!");
        }

        input.close(); 
    }
}
