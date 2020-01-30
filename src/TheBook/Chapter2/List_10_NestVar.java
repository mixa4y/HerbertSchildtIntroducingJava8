package TheBook.Chapter2;

/*
   This program attempts to declared a variable
   in an inner scope with the same name as one
   defined in an outer scope.

   *** This program will not compile. ***
*/

public class List_10_NestVar {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count = count +1) {
            System.out.println("Значение count: " + count);

          /*  int count; // Недопустимо!!! НЕЛЬЗЯ объявлять переменную count, поскольку она уже была объявлена ранее!!!
            for(count = 0; count < 2; count++)
                System.out.println("В єтой программе есть ошибка!!!");*/
        }
    }
}
