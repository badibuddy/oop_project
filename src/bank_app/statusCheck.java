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
public class statusCheck {

    public static void main(String[] args) {
        System.out.print( "Please enter your account number: " );
        String acc = Bank_app.scanner.nextLine();
        if (acc.equals(Bank_app.ac_no))
        {   
            System.out.print("Your account balance is KShs: " + Bank_app.bal +" . \n");
            Bank_app.continueTransacting();
        }
        else
        {
            System.out.print( "Please try again with  a valid account numnber: \n" );
            Bank_app.continueTransacting();
        }
    }
}
