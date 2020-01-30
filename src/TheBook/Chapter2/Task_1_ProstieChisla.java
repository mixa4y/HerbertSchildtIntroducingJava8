package TheBook.Chapter2;

// Напишите программу, которая бы находила простые числа в пределах от 2 до 100.

public class Task_1_ProstieChisla
{
    public static void main(String[] args)
    {
        int s, k;
        boolean isprime;

           for (s = 2; s < 100; s++)
           {
               isprime = true;

                // see if the number is evenly divisible
               for (k = 2; k <= s/k; k++)
               {
                   if((s % k) == 0)
                   {
                       isprime = false;
                   }
               }
                   if(isprime)
                       System.out.println(s + " is prime.");
            }
    }
}
