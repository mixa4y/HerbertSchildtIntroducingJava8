package TheBook.Chapter3;

// Применение break во вложенных циклах

public class List_24_BreakDoemo_3 {
    public static void main (String[] args){

        for (int i=0; i<3; i++){
            System.out.println("Счётчик внешнего цикла: " + i);
            System.out.print("    Счётчик внутреннего цикла: ");

            int t= 0;
            while (t<100){
                if(t==10) break;
                System.out.print(t + " "); // прервать цикл, если t =10
                t++;
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
// Как видите, оператор break из внутреннего цикла вызывает прерывание только этого
//цикла. А на выполнение внешнего цикла он не оказывает никакого влияния.
//В отношении оператора break необходимо также иметь в виду следующее. Во-первых,
//в теле цикле может присутствовать несколько операторов break, но применять их
//следует очень аккуратно, поскольку их чрезмерное количество обычно приводит к нарушению
//нормальной структуры кода. И во-вторых, оператор break, выполняющий выход
//из оператора swi tch, оказывает воздействие только на этот оператор, но не на охватывающие
//его циклы.