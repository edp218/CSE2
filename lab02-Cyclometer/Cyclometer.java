//Edgar Palaquibay
//01/30/2015
//CSE02 Brian Chen 10:10am Friday Lab
//The purpose of this program is to receive practice in using java
//to solve simple math problems for us

//What MPG does is 
//
public class Cyclometer {
    	// main method 
   	public static void main(String[] args) {

	   	int TripTime1=480;  //Time in seconds bike trip took
       	int TripTime2=3220;  //Time for 2nd bike trip
		int TripRotation1=1561;  //Wheel rotation # for Trip1
		int TripRotation2=9037; //Wheel Rotation # for trip 2
		
		double wheelDiameter=27.0,  //conversions
  	PI=3.14159, //conversions
  	FeetPerMile=5280,  //conversions
  	InchesPerFoot=12,   //conversions
  	SecondsPerMinute=60;  //conversions
	double distanceTrip1, distanceTrip2,totalDistance;  //conversions

System.out.println("Trip 1 took "+
       	     (TripTime1/SecondsPerMinute) +" minutes and had "+
       	     TripRotation1+" counts.");
System.out.println("Trip 2 took "+
       	     (TripTime2/SecondsPerMinute)+" minutes and had "+
       	     TripRotation2+" counts.");

//run the calculations; store the values. Document your
//Calculations for the distance of both trips in Miles
    distanceTrip1=TripRotation1*wheelDiameter*PI;
    	// Value above gives distance in inches
	distanceTrip1/=InchesPerFoot*FeetPerMile; // Gives distance in miles
	distanceTrip2=TripRotation2*wheelDiameter*PI/InchesPerFoot/FeetPerMile;
	
	//My data
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+(distanceTrip1+distanceTrip2)+" miles");

   	    
   	}
}