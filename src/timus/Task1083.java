package timus;

import java.io.PrintWriter;
import java.util.Scanner;


public class Task1083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(); //до 10
        String s = in.nextLine();

        int k = s.length() - 1; //до 20
        if (k == -1) k = 0;
        int result;
        int steps = 0;

        result = 1;
        if (n % k == 0) {
            while (((n-(k*steps)) != 0)&&(k != 0)){
                result = result * (n - k*steps);
                steps = steps + 1;
            }
        }
        else {
            while (((n-(k*steps)) != (n % k))&&(k != 0)){
                result = result * (n - k*steps);
                steps = steps + 1;
            }
            result = result * (n % k);
        }
        out.println(result);
        out.flush();
    }
}
