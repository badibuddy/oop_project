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
public class fundsDeposit {
    public static void main(String[] args) {
        System.out.print( "Please enter your account number: " );
        String acc = Bank_app.scanner.nextLine();
        
        if (acc.equals(Bank_app.ac_no))
        {
            System.out.print( "Please enter amount to deposit: " );
            int credit_amount = Integer.parseInt(Bank_app.scanner.nextLine());
            Bank_app.bal = Bank_app.bal + credit_amount;
           
            System.out.print("Your account has been successfully credited KShs: " + credit_amount + ".\n"
                    + "Your balance is KShs :" + Bank_app.bal +" .\n");
            Bank_app.continueTransacting();
        }
        else
        {
            System.out.print( "Please try again with  a valid account numnber [e.g 13000..] : \n" );
            Bank_app.continueTransacting();
        }
    }

}
