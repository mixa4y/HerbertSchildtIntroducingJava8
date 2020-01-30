package TheBook.Chapter3;

// Empty case

public class List_7_SwitchDemo_EmptyCase {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    System.out.println("i is 1, 2 or 3");
                    break;
                case 4:
                    System.out.println("i is 4");
                    break;
            }
        }
    }
}
//Если в приведенном выше фрагменте кода переменная i имеет значение 1, 2 или 3,
//то вызывается первый метод println (). А если ее значение равно 4, вызывается второй
//метод println (). Такое расположение нескольких пустых ветвей case подряд нередко
//используется в тех случаях, когда нескольким ветвям должен соответствовать один и тот
//же общий код.