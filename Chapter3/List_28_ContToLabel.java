package TheBook.Chapter3;

//В циклах while и do-while оператор continue вызывает передачу управления непосредственно
//условному выражению, после чего продолжается процесс выполнения
//цикла. А в цикле for сначала вычисляется итерационное выражение, затем условное
//выражение, после чего цикл продолжается.

public class List_28_ContToLabel {
    public static void main(String[] args){

        outerloop:
            for (int i=1; i<10; i++) {
                System.out.print("\nВнешний цикл: проход " + i +
                        ", внутренний цикл: ");
                for (int j=1; j<10; j++) {
                    if (j==5) continue outerloop; // продолжить внешний цикл
                    System.out.print(j);
                }
            }
    }
}
