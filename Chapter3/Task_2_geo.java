package TheBook.Chapter3;

// Напишите программу, использующую цикл for
//для вывода чисел в геометрической прогрессии: 1, 2, 4, 8, 16, 32 и т.д.

public class Task_2_geo {
    public static void main(String[] args){
        int x;

        for (x = 1; x <= 1000; x*=2)
            System.out.print(x + " ");
    }
}

// Answer in the Book is:

/*
for (x = 1; x <= 100; x+=x);
System.out.print(x + " ");
 */
