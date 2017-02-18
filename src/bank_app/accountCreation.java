/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_app;
import java.util.Scanner;


/**
 *
 * @author bweru
 */
public class accountCreation {
    
    public static void main(String[] args) {
    System.out.print( "Please enter your first name: " );
        String fname = Bank_app.scanner.nextLine();
        System.out.print( "Please enter your last name: " );
        String lname = Bank_app.scanner.nextLine();
        System.out.print( "Please enter amount to deposit: " );
        int credit_amount = Integer.parseInt(Bank_app.scanner.nextLine());
        Bank_app.bal = Bank_app.bal + credit_amount;
        
        System.out.print("Dear "+ fname + " " + lname + ", your account has been successfully created.\n"
                + "To login, use the account number " + Bank_app.ac_no + " and the PIN sent\n"
                + "to your mobile number.\n"
                + "Your account balance is now KShs: " + Bank_app.bal  + "\n"
                + "Thank you for banking with Tatizo Bank Ltd.\n");
        
        Bank_app.continueTransacting();
    }
}
