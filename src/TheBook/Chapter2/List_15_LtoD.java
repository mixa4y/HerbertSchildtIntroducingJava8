package TheBook.Chapter2;

// Demonstate automatic conversion from long to double.

public class List_15_LtoD {
    public static void main(String[] args){
        long L;
        double D;

        L = 100123285L;
        D = L; //Автоматическое преобразование типа long в тип double.

        System.out.println("L + D: " + L + " " + D);

    }
}
