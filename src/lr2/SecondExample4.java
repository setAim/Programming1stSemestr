package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class SecondExample4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        System.out.println("Введите число: ");
        int x = in.nextInt();

        if ((x >= 5)&&(x <= 10)) out.println("Это число попадает в диапазон");
        else out.println("Это число не попадает в диапазон");

        out.flush();
    }
}
