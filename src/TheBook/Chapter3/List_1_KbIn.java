package TheBook.Chapter3;


// Read a character from the keyboard.

public class List_1_KbIn {
    public static void main (String[] args)
        throws java.io.IOException // Операторб который обрабатывает ошибки, возникающие при вводе с клавиатуры
    {

            char ch;

            System.out.println("Нажмите нужную клавишу, а затем клавишу ENTER: ");

            ch = (char) System.in.read(); // Ввод символа с клавиатуры

        System.out.println("Вы нажали клавишу " + ch);
    }
}
