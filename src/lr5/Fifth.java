package lr5;

public class Fifth {
    public static void main(String[] args) {
        System.out.println("-----Задание 1-----");
        Symbol a = new Symbol('a');
        int code;

        a.printSymb();

        code = a.returnSymbCode();
        System.out.println(code);

        a.setSymb('b');

        a.printSymb();
        System.out.println("--Конец задания 1--");

        System.out.println("-----Задание 2-----");
        TwoSymbols twoSymb = new TwoSymbols('A','Z');
        twoSymb.printAllBetween();
        System.out.println("--Конец задания 2--");

        System.out.println("-----Задание 3-----");
        Coordinates coor1 = new Coordinates();
        System.out.print("Конструктор с пустыми аргументами: ");
        coor1.print();
        Coordinates coor2 = new Coordinates(2);
        System.out.print("Конструктор с 1 аргументом: ");
        coor2.print();
        Coordinates coor3 = new Coordinates(3,1);
        System.out.print("Конструктор с 2 аргументами: ");
        coor3.print();
        System.out.println("--Конец задания 3--");


    }
}
