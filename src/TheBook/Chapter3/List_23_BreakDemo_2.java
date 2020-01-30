package TheBook.Chapter3;

// Чтение вводимых данных до тех порб пока не будет получена буква q

public class List_23_BreakDemo_2 {
    public static void main(String[] args)
        throws java.io.IOException{
        char ch;

        for( ; ;) {          // бесконечный цикл завершаемый оператором break
            ch = (char) System.in.read(); // получить символ с клавиатуры
            if (ch == 'q') break;  // бесконечный цикл завершаемый оператором break
        }
        System.out.println("Вы нажали клавишу q! ");
    }
}
