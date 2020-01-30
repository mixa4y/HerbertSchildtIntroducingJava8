package TheBook.Chapter3;

// Программа загадывает букву. Если не угадал - даёт подсказку.

public class List_3_Gues {
    public static void main(String[] args)
            throws java.io.IOException{

        char ch, answer = 'K';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.println("Попытайтесь её угадать: ");

        ch = (char) System.in.read(); // Получить символ с клавиатуры

        if(ch==answer) System.out.println("** Правильно! **"); // Выводится, если угадали букву
        else {
            System.out.println("Извините, нужная буква находится ");

            //Вложенный оператор if:
            if (ch < answer)
                System.out.println("ближе к концу алфавита.");
            else System.out.println("ближе к началу алфавита");
        }
    }
}
