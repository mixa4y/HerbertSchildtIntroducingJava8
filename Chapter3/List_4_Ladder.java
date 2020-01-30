package TheBook.Chapter3;

// Demonstrate an if-else-if ladder.

//    Условные выражения в такой конструкции вычисляются сверху вниз. Как только обнаружится
//  истинное условие, выполняется связанный с ним оператор, а все остальные
//  операторы в многоступенчатой конструкции опускаются. Если ни одно из условий не
//  является истинным, то выполняется последний оператор else, который зачастую играет
//  роль условия, устанавливаемого по умолчанию. Когда же последний оператор else
//  отсутствует, а все остальные проверки по условию дают ложный результат, никаких действий
//  вообще не выполняется.


public class List_4_Ladder {
    public static void main(String args[]) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x is one");
            else if (x == 2)
                System.out.println("x is two");
            else if (x == 3)
                System.out.println("x is three");
            else if (x==4)
                System.out.println("x is four");
            else //Этот оператор выполняется только тогда, когда проверка каждого из предыдущих операторов if
                    // даёт ложный результат.

                // Default value
            System.out.println("x is not between 1 and 4");
        }
    }
}
