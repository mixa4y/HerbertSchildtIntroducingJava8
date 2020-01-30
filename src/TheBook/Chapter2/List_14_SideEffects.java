package TheBook.Chapter2;

// Side-effects can be important.
// Демонстрация роли побочных эффектов. Для это необходимо чтобы оба операнда вычислялись.

public class List_14_SideEffects {
    public static void main(String[] args) {
        int i;

        i = 0;

        /*
         Значение переменной i инкреминируетсяб несмотря на то,
          что проверяемое условие в операторе if ложно
         */
        if(false & (++i < 100))
            System.out.println("Эта строка не будет отображаться.");
        System.out.println("Оператор if выполняется: " + i); // Отображается 1

        /*
        В данном случае значение переменной i не инкременируется,
        поскольку второй операнд укороченного логичесского оператора
        не вычисляется, а следовательно, инкремент пропускается
         */
        if(false && (++i < 100))
            System.out.println("Эта строка не будет отображаться.");
        System.out.println("Оператор if выполняется: " + i); // По-прежнему отображается 1 !!!
    }
}