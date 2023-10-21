package lr1;

import java.util.Scanner;

//seld made task 10
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number a: ");
        float a = in.nextFloat();

        System.out.println("Input number b: ");
        float b = in.nextFloat();
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));

        if (a != b)  System.out.println("b - a = " + (b-a));
    }
}

