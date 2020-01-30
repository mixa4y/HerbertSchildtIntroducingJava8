package TheBook.Chapter2;

/*
   Try This 2-1

   Compute the distance to a lightening
   strike whose sound takes 7.2 seconds
   to reach you.
*/

public class List_5_Sound {
    public static void main (String[] args) {
        double distance;
        distance = 1100 * 7.2; // 1100 фут/сек  - скорость звука в воздухе. 7,2 сек - время от разряда до грома.

        System.out.println("The lightening is " + distance + " feet away.");

        double echo;
        echo = 1100 * 23.7 / 2;
        // 1100 фут/сек  - скорость звука в воздухе. 23,7 сек - время возврата эхо.
        // Делим на 2, так как звук исходит от насб отражается от объекта и возвращается.

        System.out.println("The rock is " + echo + " feet away.");
    }
}
