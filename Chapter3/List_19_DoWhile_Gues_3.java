package TheBook.Chapter3;

public class List_19_DoWhile_Gues_3
{
    public static void main(String[] args)
    throws java.io.IOException
    {
        char ch;
        do
        {
            System.out.println("Нажмите нужную клавишу, " +
                    "а затем <ENTER>: ");
            ch = (char) System.in.read(); // Получить символ с клавиатуры

        } while (ch != 'q');
    }
}
