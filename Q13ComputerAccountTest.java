import java.util.Scanner;

public class Q13ComputerAccountTest{

    /*
        this code is a test for Q13ComputerAcount. it allows user
        to enter their own credentials

        the solution involves:
        1. scanner for the user input (name, username, password)
        2. creating a new ComputerAccount object with the user input
        3. display the account details and if the user wants to change password
    */

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        // input for account details
        System.out.print("Enter real name: ");
        String realname = input.nextLine();
        
        System.out.print("Enter username: ");
        String username = input.nextLine();
        
        System.out.print("Enter password: ");
        String password = input.nextLine();
        
        // create an object of Q13ComputerAccount with user inputs
        Q13ComputerAccount account = new Q13ComputerAccount(realname, username, password);
        
        // print out the account credentials (realname, username, password)
        System.out.println("\nAccount Information:");
        account.printRealName();
        account.printUserName();
        account.printPassword();
        
        // change the account password
        System.out.print("\nEnter a new password to change: ");
        String newPassword = input.nextLine();
        account.changePassword(newPassword);
        
        // print the updated password
        System.out.println("\nUpdated Account Information:");
        account.printPassword();
        
        input.close(); 
    }
}
