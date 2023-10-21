package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextInt();
        int result;
        if (n <= k){
            result = 2;
        }
        else {
            if (n*2 % k == 0) result = n * 2 / k;
            else result = n * 2 / k + 1;
        }

        out.println(result);
        out.flush();
    }
}
