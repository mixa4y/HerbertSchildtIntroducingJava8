package TheBook.Chapter3;

// Show square roots of 1 to 99 and the rounding error.

public class List_9_SqrRoot {
    public static void main(String[] args){
        double num, sroot, rerr;

        for(num = 1.0; num < 100; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num + " равен " + sroot);

            // Ниже вычисляем ошибку округления.

            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}
