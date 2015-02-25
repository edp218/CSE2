//Edgar Palaquibay
//02/24/2015
//hw05


import java.util.Scanner;
public class ToHex { //class
    public static void main(String[ ] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Please enter three numbers representing RGB values: ");
        int Red = myScanner.nextInt();
        int Green= myScanner.nextInt();
        int Blue= myScanner.nextInt();
        
        //System.out.println("Sorry, your input must consist of integers");
        //return;
            if(Red>255 || Red< 0 || Green>255 || Green<0 || Blue>255 || Blue<0) {
            System.out.println("Sorry, you must enter values between 0-255.");
            }
            else{
        
        String str= Integer.toHexString(Red); 
        String str1= Integer.toHexString(Green);
        String str2= Integer.toHexString(Blue);
        System.out.println("The decimal numbers R:"+Red+", G:"+Green+", B:"+Blue+" is represented in hexadecimal as:"+str+str1+str2);
        
            }
    }
}