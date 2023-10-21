package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class SecondExample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        System.out.println("Введите число: ");
        int x = in.nextInt();

        out.println("Остаток от деления на 5: " + x % 5 + ", а остаток от деления на 7: " + x % 7);
        if ((x % 5 == 2)&&(x % 7 == 1)) out.println("Это число удовлетворяет критериям");
        else out.println("Это число не удовлетворяет критериям");

        out.flush();
    }
}
