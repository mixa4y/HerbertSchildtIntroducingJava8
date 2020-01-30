package TheBook.Chapter2;

// Demonstrate dynamic initialization.

public class List_7_DynamicInitialization {
    public static void main(String[] args) {
        double radius = 4, height = 5; //вычисление объёма целиндра

        //Переменная volume инициализируется динамически
        //во время выполнения программы

        double volume = 3.1416 * radius * radius * height;

        System.out.println("Объём: " + volume);
    }
}
