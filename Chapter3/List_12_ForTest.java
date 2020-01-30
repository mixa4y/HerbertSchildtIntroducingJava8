package TheBook.Chapter3;

// Loop until an S is typed.

public class List_12_ForTest {
    public static void main(String[] args)
        throws java.io.IOException{

        int i;
        System.out.println("Для остановки нажмите клавишу S");
        for(i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Проход # " + i);
    }
}
