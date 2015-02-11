//Edgar Palaquibay
//02/10/2015
///hw03

import java.util.Scanner;
public class Root {
    public static void main(String [ ] args) {
        Scanner myScanner;
        myScanner= new Scanner (System,in);
        System.out.print("Enter a value for x : ");
        double x= myScanner.nextInt();
        double Guess;
        double SecondGuess;
        double ThirdGuess;
        double FourthGuess;
        double FifthGuess;
        double SixthGuess;
        Guess= (x/3);
        SecondGuess= (2*Guess*Guess*Guess+x)/(3*Guess*Guess);
        
    }
}