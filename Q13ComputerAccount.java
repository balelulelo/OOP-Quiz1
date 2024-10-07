// File: Q13ComputerAccount.java

public class Q13ComputerAccount{
     /**
     * this class represents a user account containing the real name, username,
     * and password. it provides methods to display account details and 
     * change the password.
     * 
     * the solution involves:
     * 1. storing the real name, username, and password.
     * 2. print the account details.
     * 3. a method to change the password.
     */


    // used for storing account details
    private String realname;   
    private String username;   
    private String password;   

    public Q13ComputerAccount(String realname, String username, String password){
        this.realname = realname;
        this.username = username;
        this.password = password;
    }

    // print out the real name of the user
    public void printRealName(){
        System.out.println("Real Name: " + realname);
    }

    // print out the username of the account owner
    public void printUserName(){
        System.out.println("username: " + username);
    }

    // print out the password of the user
    public void printPassword(){
        System.out.println("Password: " + password);
    }

    // set a new password for the user
    public void changePassword(String newPassword){
        password = newPassword;  
        System.out.println("Password has been changed.");
    }
}
