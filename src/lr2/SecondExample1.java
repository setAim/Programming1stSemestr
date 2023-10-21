package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class SecondExample1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        System.out.println("Введите число: ");
        int x = in.nextInt();

        out.println("Остаток от деления: " + x % 3);
        if (x % 3 == 0) out.println("Это число делится на 3 нацело");
        else out.println("Это число не делится на 3");

        out.flush();
    }
}
