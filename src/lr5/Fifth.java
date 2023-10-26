package lr5;

import java.io.PrintWriter;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер задания лабораторной от 1 до 6:");
        int taskNumber = in.nextInt();

        switch (taskNumber){
            case 1:{
                System.out.println("-----Задание 1-----");
                Symbol a = new Symbol('a');
                int code;

                a.printSymb();

                code = a.returnSymbCode();
                System.out.println(code);

                a.setSymb('b');

                a.printSymb();
                System.out.println("--Конец задания 1--");
                break;
            }
            case 2:{
                System.out.println("-----Задание 2-----");
                TwoSymbols twoSym = new TwoSymbols('A','Z');
                twoSym.printAllBetween();
                System.out.println("--Конец задания 2--");
                break;
            }
            case 3:{
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
                break;
            }
            case 4:{
                System.out.println("-----Задание 4-----");
                CharAndInt charAndInt = new CharAndInt(65.1234D);
                char c = charAndInt.getLetter();
                int i = charAndInt.getNumber();
                System.out.println("char: " + c + ", int: "+ i);
                System.out.println("--Конец задания 4--");
                break;
            }
            case 5:{
                System.out.println("-----Задание 5-----");
                UnderOneHundred first = new UnderOneHundred();
                UnderOneHundred second = new UnderOneHundred(120);
                System.out.println("Объект класса, заданный через пустой конструктор, значение целочисленного поля: " + first.getNumber());
                System.out.println("Подставим в число 1 значение 101 через сеттер");
                first.setNumber(101);
                boolean isNumberLess100 = first.checkNumber();
                System.out.println("Число 1 в объекте класса меньше 100? " + isNumberLess100);
                System.out.println("Объект класса, заданный через конструктор с целым числом 120, значение целочисленного поля: " + second.getNumber());
                isNumberLess100 = second.checkNumber();
                System.out.println("Число 2 в объекте класса меньше 100? " + isNumberLess100);
                System.out.println("Подставим в число 2 значение 500 через метод");
                second.placeNumber(500);
                isNumberLess100 = second.checkNumber();
                System.out.println("Число 2 в объекте класса меньше 100? " + isNumberLess100);
                System.out.println("--Конец задания 5--");
                break;
            }
            case 6:{
                System.out.println("-----Задание 6-----");
                System.out.println("--Конец задания 6--");
                break;
            }
            default: System.out.println("Введено что-то некорректное, перезапустите программу.");

        }








    }
}
