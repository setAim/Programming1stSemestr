package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class SecondExample3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        System.out.println("Введите число: ");
        int x = in.nextInt();

        out.println("Остаток от деления на 4: " + x % 4);
        if ((x % 4 == 0)&&(x >= 10)) out.println("Это число удовлетворяет критериям");
        else out.println("Это число не удовлетворяет критериям");

        out.flush();
    }
}
