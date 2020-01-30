package TheBook.Chapter3;

// Guess the letter game.

public class List_2_Gues {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch, answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.println("Попытайтесь её угадать: ");

        ch = (char) System.in.read(); // Получить символ с клавиатуры

        if(ch==answer) System.out.println("** Правильно! **"); // Выводится, если угадали букву
        else System.out.println("...Извините, Вы не угадали."); // Выводится, если не угадали букв
    }
}
