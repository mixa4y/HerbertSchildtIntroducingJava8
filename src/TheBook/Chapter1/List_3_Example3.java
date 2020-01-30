package TheBook.Chapter1;

/*
*This program illustrates the differences
*between int and double
*/

class List_3_Example3 {
    public static void main (String[] agrs) {
        int var1; // this declares int variable
        double x; // this declares a floating-point variable

        var1 = 10; // assign var1 the value 10
        x = 10.0; // assign x the value 10.0

        System.out.println("Original value of var1: " + var1);
        System.out.println("Original value of x: " + x);

        System.out.println(); // print a blank line

        // now divide both on 4

        var1 = var1 / 4;
        x = x / 4;

        System.out.println("var1 after division:" + var1);
        System.out.println("x after division: " + x);
    }
}
