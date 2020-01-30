package TheBook.Chapter3;

// Пропуск отдельных составляющих в определении цикла for

public class List_14_EmptyFor_2 {
    public static void main(String[] args){
        int i;
        i=0; // из определения цикла исключено инициализирующее выражение.

        for( ; i < 10; ) {
            System.out.println("Проход № " + i);
            i++; //Инкрементировать переменную цикла.
        }
    }
}

//В данном примере переменная i инициализируется перед началом цикла, а не в самом
//цикле for. Как правило, переменная управления циклом инициализируется в цикле
//for. Выведение инициализирующей части за пределы цикла обычно делается лишь в том
//случае, если первоначальное значение упрамяющей им переменной получается в результате
//сложного процесса, который нецелесообразно вводить в само определение цикла for.