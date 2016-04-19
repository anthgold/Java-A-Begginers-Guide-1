/*
  Try This 1-1

  This program converts gallons to liters.

  It is called GalToLit.java
*/

class GalToLit {
	public static void main (String args[])  {
		double gallons; // holds the number of gallons
		double liters; // holds the number of liters

		gallons = 10; // starts with 10 gallons

    liters = gallons * 3.7854; // converts to liters

		System.out.println(gallons + " gallons is " + liters + " liters.");
	}
}
