package TheBook.Chapter3;

// Справочник по циклам

public class List_21_Help_2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Справка:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.println("Выберите: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '5');

        //Обратите внимание на вложенные циклы do-while, используемые с целью избавиться
        //от нежелательных символов, оставшихся во входном буфере. После внесения
        //приведенных выше изменений программа будет отображать меню в цикле до
        //тех пор, пока пользователь не введет числовое значение в пределах от 1 до 5.
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if (условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Оператор switch:\n");
                System.out.println("switch (выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов;");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Оператор for:\n");
                System.out.print("for (инициализация; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case '4':
                System.out.println("Оператор while:\n");
                System.out.println("while (условие) оператор;");
                break;
            case '5':
                System.out.println("Оператор do-while:\n");
                System.out.println("Оператор do:{");
                System.out.println(" оператор;");
                System.out.println("} while (условие)");
                break;
        }
    }
}
