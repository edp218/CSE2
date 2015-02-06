//Edgar Palaquibay
//02/03/2015
//Hw02



public class Arithmetic{
    
    public static void main(String[ ] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        //Declaring variables for total cost for each item, after tax, grand total before tax and after tax
        double totalSockCost1$; //total of the socks before tax
        double totalSockTax$; //total tax for socks
        double totalSockCost2$; //total cost of the socks including tax
        
        double totalGlassCost1$;//total cost of the glass before tax
        double totalGlassTax$;//total tax for glass
        double totalGlassCost2$;//total cost of the glass including tax
        
        double totalEnvelopeCost1$;//total cost of the envelope before tax
        double totalEnvelopeTax$;//total tax for envelope
        double totalEnvelopeCost2$;///total cost of the envelope including tax
        
        double totalBeforeTax$;//grand total before tax
        double totalAfterTax$;//grand total after tax
        double totalTax$;//sales tax grand total
        
        totalSockCost1$= nSocks*sockCost$;
        totalSockTax$= taxPercent*totalSockCost1$;
        totalSockCost2$= totalSockCost1$ + totalSockTax$;
        
        totalGlassCost1$= nGlasses*glassCost$;
        totalGlassTax$= taxPercent*totalGlassCost1$;
        totalGlassCost2$= totalGlassCost1$ + totalGlassTax$;
        
        totalEnvelopeCost1$= nEnvelopes*envelopeCost$;
        totalEnvelopeTax$= taxPercent*totalEnvelopeCost1$;
        totalEnvelopeCost2$= totalEnvelopeCost1$ + totalEnvelopeTax$;
        
        totalBeforeTax$= totalSockCost1$+totalGlassCost1$+totalEnvelopeCost1$;
        totalAfterTax$= totalSockCost2$+totalGlassCost2$+totalEnvelopeCost2$;
        totalTax$= totalSockTax$+totalGlassTax$ + totalEnvelopeTax$;
        
        //Printing out required values
        System.out.println("Socks");
        System.out.println("There are "+nSocks+" pairs of socks ");
        System.out.println("It costs "+sockCost$+" per pair of sock");
    
        System.out.println("Drinking glasses");
        System.out.println("There are "+nGlasses+" drinking glasses");
        System.out.println("It costs "+glassCost$+" per drinking glass");
        
        System.out.println("Envelopes");
        System.out.println("There are "+nEnvelopes+" envelopes");
        System.out.println("It costs "+envelopeCost$+" per box of envelope");
        
        System.out.println("The total cost of the socks before tax is "+totalSockCost1$+"");
        System.out.println("The total sales tax on the socks is "+totalSockTax$+"");
        System.out.println("The total cost of the socks after tax is "+totalEnvelopeCost2$+"");
        
        System.out.println("The total cost of the drinking glasses before tax is "+totalGlassCost1$+"");
        System.out.println("The total sales tax on the drinking glasses is "+totalGlassTax$+"");
        System.out.println("The total cost of the drinking glasses after tax is "+totalGlassCost2$+"");
        
        System.out.println("The total cost of the boxes of envenlopes before tax is "+totalEnvelopeCost1$+"");
        System.out.println("The total sales tax for the box of envelope is "+totalEnvelopeTax$+"");
        System.out.println("The total cost of the box of envelopes after tax is "+totalEnvelopeCost2$+"");
        
        System.out.println("The total cost of all items before tax is "+totalBeforeTax$+"");
        System.out.println("The total sales tax of all items is "+totalTax$+"");
        System.out.println("The total cost of all items after tax is "+totalAfterTax$+"");

    }
}
