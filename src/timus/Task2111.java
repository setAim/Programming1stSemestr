package timus;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

//not ready: time 1.065s
public class Task2111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long[] roadsLength;
        roadsLength = new long[n];

       // int buff;
        long summLength = 0;
        for (int i = 0; n > i; i++){
            roadsLength[i] = in.nextInt();
            summLength = summLength + roadsLength[i];
        }

        Arrays.sort(roadsLength);

        long taxes = 0;
        for (int i = 0; i < n; i++){
            taxes = taxes + summLength * roadsLength[i] + (summLength - roadsLength[i]) * roadsLength[i];
            summLength = summLength - roadsLength[i];
        }

        out.println(taxes);
        out.flush();
    }
}
