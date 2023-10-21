package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class SecondExample5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        System.out.println("Введите число: ");
        int x = in.nextInt();
        if (x < 1000) out.println("В числе " + x + " нет значения в разряде тысяч");
        if ((x > 999)&&(x<10000)) out.println("В числе " + x + " — " + x/1000 + " в разряде тысяч");
        else {
            String s = String.valueOf(x);
            //out.println(s);
            int l = s.length();
            String r = s.substring(l-4,l-3);
            //out.println(r);
            if (r.equals("0")) out.println("В числе " + x + " — 0 в разряде тысяч");
            else out.println("В числе " + x + " — " + r + " в разряде тысяч");
        }
      out.flush();
    }
}
