package TheBook.Chapter2;

// A promotion surprise! Promotion rules - правила повышения типов.

public class List_19_PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;  // Приведение типов не требуетсяб т.к. тип уже повышен до int.

        b = (byte) (b + b);  // Здесь для присваивания значения int переменной типа byte требуется приведение типов!!!

        System.out.println("i and b: " + i + " " + b);
    }
}
