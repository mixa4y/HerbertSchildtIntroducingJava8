package TheBook.Chapter3;

// Расположение метки имеет огромное значение!!!!!!

public class List_26_BreakDemo_6 {
    public static void main(String[] args){
        int x = 0, y = 0;

        // Здесь метка располагается перед оператором for
        stop1: for (x=0; x<5; x++){
            for (y=0; y<5; y++){
                if (y==2) break stop1;
                System.out.println("x & y: " + x + " " + y);
            }
        }
        System.out.println();

        // А здесь метка располагается непосредственно перед
        // открывающей фигурной скобкой
        for (x = 0; x < 5 ; x++)
            stop2:{
            for (y=0; y<5; y++){
                if (y==2) break stop2;
                System.out.println("x & y: " + x + " " + y);
            }
            }
    }
}
//В данной программе наборы вложенных циклов идентичны, за исключением того,
//что в первом наборе метка находится перед внешним циклом for. В таком случае при
//выполнении оператора break управление передается в конец всего блока цикла for, а
//оставшиеся итерации внешнего цикла пропускаются. Во втором наборе метка находится
//перед открывающей фигурной скобкой кодового блока, определяющего тело внешнего
//цикла. Поэтому при выполнении оператора break stop2 управление передается в конец
//тела внеy