package TheBook.Chapter1;

/*
Try This 1-2

This program displays a conversion
table of gallons to liters.
*/

class List_8_GalToLitTable {
    public static void main (String[] args) {
        double gallons, liters;
        int counter; // переменнаяб которая будет считать количество выведенных значений на экран. После каждых 10 - должнабыть пустая строка.

        counter = 0; //счётчик инициализируем с нулевым значением
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; //преобразование галлонов в литры
            System.out.println(gallons + " gallons is " + liters + " liters.");
            counter++; //увеличиваем значение счётчика строк на 1
            if (counter == 10){ //если значение счётчика равно 10 - выводит пустую строку
                System.out.println();
                counter = 0; //обнуляем счётчик строк

            }
        }
    }
}
