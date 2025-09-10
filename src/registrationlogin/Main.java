/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationlogin;
 import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       REGnLOG keys = new REGnLOG();
        Scanner scanner = new Scanner(System.in);

        //username
        System.out.print("Enter username(max 5 characters, must contain an underscore): ");
        String username = scanner.nextLine();
        if(keys.validateUsername(username)){
            System.out.println("Username successfully captured.");
        }else{
             System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }

        //passsword
        System.out.print("Enter password (min 8 characters, at least one capital letter, one number, and one special character): ");
        String password = scanner.nextLine();
        if(keys.)

        System.out.print("Enter South African cell phone number (format: +27xxxxxxxxx or 27xxxxxxxxx or 0xxxxxxxxx): ");
        String phoneNumber = scanner.nextLine();

        

    

    private static boolean validatePassword(String password) {
        String regex = "^(?=.[A-Z])(?=.\\d)(?=.[@$!%?&])[A-Za-z\\d@$!%*?&]{8,}$"; // Ensure password meets requirements
        if (!Pattern.matches(regex, password)) {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters; a capital letter, a number, and a special character.");
            return false;
        }
        return true;
    }

    private static boolean validatePhoneNumber(String phoneNumber) {
        String regex = "^\\+?27\\d{9}$"; // Basic South African phone number format
        if (Pattern.matches(regex, phoneNumber)) {
            System.out.println("");
            return true;
        }
        return false;
    
    }
    
}
