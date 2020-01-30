package TheBook.Chapter1;

/*
   This program displays a conversion
   table of inches to meters.

   Call this program InchToMeterTable.java.
*/

class Task2InchesToMeters {
    public static void main (String[] args){
        double inch, meter;
        int counter;

        counter = 0;
        for(inch = 1; inch <= 144; inch++){
            meter = inch / 39.37;
            System.out.println(inch + " inches = " + meter + " meters.");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
