package TheBook.Chapter1;
/*
   Try This 1-1
   This program converts gallons to liters.
   Call this program List_4_GalToLit.java.
*/

public class List_4_GalToLit {
    public static void main (String[] args) {
        double gallons; //holds the number of gallons
        double liters; //holds the conversion to liters

        gallons = 25; // start with 10 gallons

        liters = gallons * 3.7854; //convert to liters

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
