package TheBook.Chapter2;

// Demonstrate casting.  Демонстрация преведения типов.

public class List_16_CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y); // Приводит тип double к типу int. В ДАННОМ СУЧАЕ ТЕРЯЕТСЯ ДРОБНАЯ ЧАСТЬ ЧИСЛА.
        System.out.println("Целочисленный результат деления x/y: " + i);

        i = 100;
        b = (byte) i; // В этом случае инфо не теряетсяб т.к. byte может содержать значение 100.
        System.out.println("Значение b: " + b);

        i = 138;
        b = (byte) i; // Инфо теряется т.к. byte не может содержать значение 257.
        System.out.println("Значение b: " + b);

        b = 88; // Представление символа "Х" в коде ASCII.
        ch = (char) b; // !!! Явное приведение несовместимых типов !!!
        System.out.println("ch: " + ch);
    }
}
