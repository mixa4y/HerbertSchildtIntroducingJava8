package TheBook.Chapter3;

// Demonstrate switch

//      The switch statement compares the String object in its expression
//  with the expressions associated with each case label as if it were using the String.equals method;
//  consequently, the comparison of String objects in switch statements is case sensitive.
//  The Java compiler generates generally more efficient bytecode
//  from switch statements that use String objects than from chained if-then-else statements.

public class List_5_SwitchDemo {
    public static void main(String args[]) {
        int i;

        for (i = 0; i < 10; i++)
            switch(i){
                case 0:
                    System.out.println("i is 0");
                    break;
                case 1:
                    System.out.println("i is 1");
                    break;
                case 2:
                    System.out.println("i is 2");
                    break;
                case 3:
                    System.out.println("i is 3");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:                                   // Не является обязательной.
                    System.out.println("i is 5 or more");
        }
    }
}
