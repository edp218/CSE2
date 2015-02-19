//Edgar Palaquibay
//02/09/2015
//hw03
//the purpose of this program is to manipulate the data given to
//find the total distance traveled based on the diameter and other
//basic data


import java.util.Scanner;
import java.text.DecimalFormat;
public class Bicycle {
    
    public static void main(String[ ] args) {
        Scanner myScanner;
        myScanner =new Scanner (System.in);
        System.out.print("Enter the number of counts : ");
        int nCnts= myScanner.nextInt();
        System.out.print("Enter the number of seconds : ");
        int nSecs= myScanner.nextInt();
        double TotDistTrav;
        double Minutes;
        double WheelDiameter= 27.0;
        double Pi= 3.14;
        double FPM= 5280;
        double IPF= 12;
        double SPM= 60;
        double MPH;

        TotDistTrav= nCnts*WheelDiameter*Pi;
        TotDistTrav/= IPF*FPM;
        DecimalFormat df= new DecimalFormat("###.##");
        Minutes= (nSecs/SPM);
        MPH= TotDistTrav/(Minutes/60);
        
        TotDistTrav*= 100;
        int TotDistTravAsInt= (int) TotDistTrav;
        TotDistTrav=TotDistTravAsInt*.01;
        
        MPH*= 100;
        int MPHAsInt= (int) MPH;
        MPH= MPHAsInt*.01;
        
        System.out.println("The total distance was "+TotDistTrav+ "miles and took " +Minutes+ "minutes");
        System.out.println("The average miles per hour was" +df.format(MPH));
    }
}
