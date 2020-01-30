package TheBook.Chapter2;

public class List_11_ModDemo {
    public static void main(String[] args){
    int iresult, irem;
    double dresult, drem;

    iresult = 10 / 3;
    irem = 10 % 3;

    dresult = 10.0 / 3.0;
    drem = 10.0 % 3.0;

    System.out.println("Результат и остаток от деления 10 / 3: " + iresult + " " + irem);
    System.out.println("Результат и остаток от деления 10.0 / 3.0: " + dresult + " " + drem);
    }
}
