package TheBook.Chapter2;

/*
   Use the Pythagorean theorem to find
   find the length of the hypotenuse
   given the lengths of the two opposing
   sides.
*/

public class List_2_Hypotenuse {
    public static void main(String[] args){
        double x, y, z;

        //катеты
        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y); //метод sqrt является членом класса Math, поэтому обязательно указывается класс!!!

        System.out.println("The length of hypotenuse is " + z);
    }
}
