 package TheBook.Chapter2;

// Character variables can be handled like integers!!!

class List_3_CharArithDemo {
    public static void main(String[] args){
        char ch = 'X';
        System.out.println("ch contains " + ch);

        ch++; // инкреминируем переменную ch
        System.out.println("Now ch contains " + ch);

        ch = 9810; // присвоить переменной ch значение Z (Переменным типа char можно присвоить целочисленное значение).
        System.out.print("Now ch contains " + ch);
    }
}
