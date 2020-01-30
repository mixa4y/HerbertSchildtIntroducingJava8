package TheBook.Chapter1;

/*
  Demonstrate a block of code.

  Call this file List_7_BlockDemo.java.
*/
public class List_7_BlockDemo {
    public static void main (String[] args) {
        double i, j, d;

        i = 5;
        j = 10;

        //the target of this if is block (Телом этого оператора if является целый блок кода)
        if(i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}