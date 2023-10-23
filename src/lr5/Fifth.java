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
    }
}
