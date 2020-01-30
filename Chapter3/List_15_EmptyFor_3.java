package TheBook.Chapter3;

// Тело цикла может быть пустым!!!

public class List_15_EmptyFor_3 {
    public static void main(String[] args){
        int i;

        int sum = 0;
        for(i = 1; i < 5; sum += i++); //Отсутствует тело цикла

        System.out.println("Сумма: " + sum);
    }
}

// sum = sum + i;
// sum = (0 + 1) + (0 + 2) + (0 + 3) + (0 + 4) = 10