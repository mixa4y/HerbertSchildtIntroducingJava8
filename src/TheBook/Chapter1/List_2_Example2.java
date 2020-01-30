package TheBook.Chapter1;
/*
   This demonstrates a variable.

*/
class List_2_Example2 {
    public static void main (String[] args) {
        int var1; //this declares an int variable
        int var2; //this declares another variable

        /*
        int var1, var2;
        the same as
        int var1;
        int var2;
        */

        var1 = 1024; //this assigns 1024 to var1

        System.out.println("var1 contains " + var1);

        var2 = var1 / 2; //this declares var2

        System.out.print("var2 contains var1/2 : ");
        System.out.println(var2);

    }

}
