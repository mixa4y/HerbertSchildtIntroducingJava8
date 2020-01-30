package TheBook.Chapter2;

// Demonstrate boolean values.

public class List_4_BooleanDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        //the boolean value can control the if statement
        if(b) System.out.println("Эта инструкция выполняется.");

        b = false;
        if(b) System.out.println("Эта инструкция не выполняется.");

        //В результате выполнения сравнения
        //получается логическое значение
        System.out.println("Результат сравнения 10 > 9: " + (10 > 9)); //выражение (10 > 9) в скобках, так как опереация "+" имее больший приоритет.
    }
}
