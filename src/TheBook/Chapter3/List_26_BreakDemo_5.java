package TheBook.Chapter3;

// На этот раз оператор break будет использован
//для выхода за пределы нескольких вложенных циклов. Когда во внутреннем цикле выполняется
//оператор break, управление передается в конец блока внешнего цикла. Этот
//блок помечен меткой done. В результате происходит выход из всех трех циклов.

public class List_26_BreakDemo_5 {
    public static void main(String[] args){

        done:
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                for (int k=0; k<10; k++){
                    System.out.println(k + " ");
                    if (k==5) break done;  // переход по метке done
                }
                System.out.println("После цикла по k"); // не выполнится
            }
            System.out.println("После цикла по j"); // не выполнится
        }
        System.out.println("После цикла по i");
    }
}
