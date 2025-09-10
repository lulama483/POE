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
        if(keys.validatePassword(password))

        System.out.print("Enter South African cell phone number (format: +27xxxxxxxxx or 27xxxxxxxxx or 0xxxxxxxxx): ");
        String phoneNumber = scanner.nextLine();

        

    

       
    }
    
}
