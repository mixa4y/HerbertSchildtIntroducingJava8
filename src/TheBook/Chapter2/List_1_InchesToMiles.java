package TheBook.Chapter2;

/*
   Compute the number of cubic inches
   in 1 cubic mile.
*/
public class List_1_InchesToMiles {
    public static void main (String[] args){
        long ci;
        long im;

        im = 5280 * 12; // в 1 миле 5820 футовб в одном футе - 12 дюймов. Вычисляем кол-во дюймов в миле.
        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in cubic mile.");
    }
}
