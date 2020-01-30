package TheBook.Chapter3;

// Пропуск отдельных составляющих в определнии цикла for

public class List_13_EmptyFor {
    public static void main(String[] args){
        int i;

        for(i = 0; i <10; ){
            System.out.println("Проход № " + i);
            i++; // Инкрементировать переменную цикла.
        }
    }
}
