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
public class fundsWithdrawal {


    public static void main(String[] args) {
     System.out.print( "Please enter your first name: " );
        String fname = Bank_app.scanner.nextLine();
        System.out.print( "Please enter your last name: " );
        String lname = Bank_app.scanner.nextLine();
        System.out.print( "Please enter your account number: " );
        String acc = Bank_app.scanner.nextLine();
        if (acc.equals(Bank_app.ac_no))
        {
            System.out.print( "Please enter amount you like to withdraw in multiples of 200: " );
            int debit_amount = Integer.parseInt(Bank_app.scanner.nextLine());
            
            if (debit_amount > Bank_app.bal){
                System.out.print( "Insuffient funds. You balance is not enought to withdraw KSh: " + debit_amount+ "\n");
                Bank_app.continueTransacting(); 
            } else {
                Bank_app.bal = Bank_app.bal - debit_amount;
                System.out.print("Dear "+ fname + " " + lname + ", your account has been successfully debited KShs: " + debit_amount + ".\n"
                    + "Your balance is KShs :" + Bank_app.bal +" . \n");
                Bank_app.continueTransacting();
            }} else {
            
            System.out.print( "Please try again with  a valid account numnber: \n" );
            Bank_app.continueTransacting();
        }
    }
}
