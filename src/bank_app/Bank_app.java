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
public class Bank_app {
public static final Scanner scanner = new Scanner( System.in );
public static float bal = 0;   
public static String ac_no = "130015854";
private static int sel;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.print( "\tWelcome to Tatizo Bank Limited. \n Kindly select the transaction type you would like to perform: "
            + "\n 1. Account creation"
            + "\n 2. Withdrawal"
            + "\n 3. Deposit"
            + "\n 4. Status check \n :" );
    sel = Integer.parseInt(scanner.nextLine());
    get_transaction_type();
    
    }
    
    public static int get_transaction_type(){
    //System.out.println("Please select a choice: 1 - 4:");
    switch (sel) {
            case 1:
                accountCreation.main(new String[] {""});
                break;
            case 2:
                fundsWithdrawal.main(new String[] {""});
                break;
            case 3:
                fundsDeposit.main(new String[] {""});                
                break;
            case 4:
                statusCheck.main(new String[] {""});
                break;
            default:
                System.err.println("Kindly input relevant choice i.e [1],[2],[3],[4]");
                System.exit(0); 
        }

    return sel;
    }
    
    
    
    public static void continueTransacting(){
        System.out.print("Would you like to perform another tranansaction [yes, no]: \n");
        String resp_ = scanner.nextLine();
        if (resp_.equals("yes")){
//            System.out.print( "good");
            String[] params = new String[] {""};
            Bank_app.main(params);
       
        }
        else{
            System.out.print("Thank you for banking with Tatizo Bank Ltd.\n");

        } 
    }
    
    }
    
   
