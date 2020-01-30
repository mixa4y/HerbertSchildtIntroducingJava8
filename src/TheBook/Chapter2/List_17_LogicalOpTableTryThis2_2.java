package TheBook.Chapter2;

/*
   Try This 2-2

   Print a truth table for the logical operators.
*/

public class List_17_LogicalOpTableTryThis2_2 {
    public static void main(String[] args){
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tR\t\tXOR\t\tNOT");
        //System.out.println("P\tQ\tAND\tR\tXOR\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (! p));

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (! p));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (! p));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (! p));

        }

}
