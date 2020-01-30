package TheBook.Chapter1;
/*
  Demonstrate the if.

  Call this file List_5_IfDemo.java.
*/

public class List_5_IfDemo {
    public static void main (String[] args){
        int a, b, c;

        a = 2 ;
        b = 3 ;

        if(a < b) System.out.println("a is less than b");
        // this won't print anything
        if (a==b) System.out.println("this won't see this");

        System.out.println();

        c = a - b; // c contains -1

        System.out.println("c contains -1");

        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");

        System.out.println();

        c = b - a; // c now contains 1
        System.out.println("c contains 1");
        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");
    }
}
