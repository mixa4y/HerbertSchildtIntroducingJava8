package TheBook.Chapter3;

/*
Использовать вложенные циклы для нахождения
делителей от 2 до 100
*/

public class List_30_FindFac {
    public static void main(String[] args){

        for (int i=2; i<=100; i++) {
            System.out.println("Делители " + i + ": ");
            for (int j=2; j<=i; j++)
                if ((i%j) == 0 ) System.out.print(j + " ");
                System.out.println();
        }
    }
}
