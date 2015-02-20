//Edgar Palaquibay
//hw04


import java.util.Scanner;
import java.util.Random;

public class Banking {
    public static void main(String[ ] args) {
        
        Scanner myScanner = new Scanner(System.in);
        double InitialBal= Math.random()*(5000-1000) + 1000;
        InitialBal *= 100;
        int InitialBalAsInt = (int) InitialBal;
        InitialBal= InitialBalAsInt * .01;
        System.out.println(" Your account's current balance is: "+InitialBal+" ");
        System.out.println("Would you like to Deposit (D), Withdraw (W), or view balance (B)?");
        String string = myScanner.next();
        string = string.toUpperCase();
        char input= string.charAt(0);
        
        if (input == 'D' || input == 'W' || input == 'B'); {
            switch (input) {
        
        case ('D'):
            System.out.println("How much would you like to deposit?");
            int deposit = myScanner.nextInt();
            double TotDepot = InitialBal + deposit;
            System.out.println("Your account's current balance is: "+ TotDepot +" ");
            if (deposit < 0) {
                System.out.println("Invalid input");
            }
            return;
        
        case ('W'):
            System.out.println("How much would you like to withdraw?");
            int withdrawal = myScanner.nextInt();
            double balance = InitialBal - withdrawal;
            System.out.println("Your accounts current balance is: "+ balance +" ");
            if (withdrawal < 0) {
                System.out.println("Invalid input");
            }
            return;
        
        case ('B'):
            System.out.println("This is your current balance: "+ InitialBal +" ");
        
            }
        }
        
        
    }
}