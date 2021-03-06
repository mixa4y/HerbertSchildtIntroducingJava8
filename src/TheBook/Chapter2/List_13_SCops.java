package TheBook.Chapter2;

// Demonstrate the short-circuit operators. Укороченные логистические операции.

public class List_13_SCops {
    public static void main(String[] args){
        int n, d, q;

        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0) // УкороченнаЯ операция предотвращает деление на 0.
            System.out.println(d + " является делителем " + n);



        d = 0; // Установим для d нулевое значение

        // Второй операнд не вычисляется, поскольку значение
        // переменной d равно нулю.
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " является делителем " + n);

         /*
         А теперь те же самые действия выполняются без использования
         укороченного логичесского оператора. В результате возникнет ошибка "деление на нуль".
         */
         if(d != 0 & (n % d) == 0) // Теперь вычисляются оба выражения, в результате чего будет производиться деление на нуль.
             System.out.println(d + " является делителем " + n);
    }
}
