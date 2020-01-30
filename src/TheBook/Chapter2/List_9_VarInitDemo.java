package TheBook.Chapter2;

// Demonstrate lifetime of a variable.

public class List_9_VarInitDemo {
    public static void main(String[] args) {
        int x;

        for(x = 0; x < 5; x++) {
            int y = -1; // переменная "у" инициализируется при каждом входе в блок во время работы for.
            System.out.println("y: " + y); //Всегда будет выводиться значение у = -1.
            y = 100;
            System.out.println("Изменённое значение у: " + y);
        }
    }
}

