package TheBook.Chapter1;
/*
  Demonstrate the for loop.

  Call this file List_6_ForDemo.java.
*/

class List_6_ForDemo {
    public static void main (String[] args) {
        int count;

        for(count = 0; count < 5; count++)
            System.out.println("This is count " + count); // prints "This is count " + count till count <5

        System.out.println("Done!"); // prints "Done!", when count >= 5
    }
}
