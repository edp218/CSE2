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
        ThirdGuess= (2*SecondGuess*SecondGuess*SecondGuess+x)/(3*SecondGuess*SecondGuess);
        FourthGuess= (2*ThirdGuess*ThirdGuess*ThirdGuess+x)/(3*ThirdGuess*ThirdGuess);
        FifthGuess= (2*FourthGuess*FourthGuess*FourthGuess+x)/(3*FourthGuess*FourthGuess);
        SixthGuess= (2*FifthGuess*FifthGuess*FifthGuess+x)/(3*FifthGuess*FifthGuess);
        System.out.println("The crude estimate of the cube root " +Guess);
        System.out.println("The cube root of x is " + SixthGuess);
        System.out.println("The value of the crude estimate cubed is " + SixthGuess*SixthGuess*SixthGuess);
        
    }
}