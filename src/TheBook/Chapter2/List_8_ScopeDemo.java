package TheBook.Chapter2;

// Demonstrate block scope.
// Демонстрация области де йствия блока кода.

public class List_8_ScopeDemo {
    public static void main(String[] args) {
        int x; // Эта переменная доступна для всего кода в методе main.

        x = 10;
        if(x == 10) { // Начало новой области действия.

            int y = 20; // Эта переменная доступна только в этом блоке.

            // Обе переменные, "х" и "у", доступны в данном кодовом блоке.

            System.out.println(" x and y: " + x + " " + y);
            x = y * 2;
    }
         //y = 100; // Ошибка! В єтом месте переменная "у" недоступна (находится вне своей области действия).

        // Переменная "х" по-прежнему доступна.
        System.out.println("x is " + x);
    }
}