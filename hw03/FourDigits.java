//edgar palaquibay
//02/11/2015
//hw03
//part 3
//the purpose is to use doubles so the program can read the digits to the
//right of the decimal point
import java.util.Scanner;

public class FourDigits {
public static void main(String [ ] args) { 
    Scanner myScanner;
    myScanner= new Scanner (System.in);
    System.out.print("Enter a double : ");
    double nFourDigits= myScanner.nextDouble();
    double i = nFourDigits*10000;
    int nFirst= (int) nFourDigits;
    double k = nFourDigits*10000;
    double j = i%10000;
    System.out.println("The four digits are "+j+" ");
}
}
