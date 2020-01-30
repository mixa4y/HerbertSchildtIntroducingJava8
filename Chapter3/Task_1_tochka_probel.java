package TheBook.Chapter3;

// Напишите программу, которая получает символы, введенные с клавиатуры, до
//тех пор, пока не встретится точка. Предусмотрите в программе счетчик пробелов.
//Сведения о количестве пробелов должны выводиться в конце программы.

public class Task_1_tochka_probel {
    public static void main(String [] args)
    throws java.io.IOException{
        char ch;
        int spaces = 0;

        System.out.println("Enter a period to stop.");

     do {
         ch = (char) System.in.read();
         if (ch == ' ') spaces++;
     }
         while (ch != '.');
         System.out.println("Spaces: " + spaces);
    }
}
