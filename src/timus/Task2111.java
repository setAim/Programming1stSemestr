package timus;

import java.io.PrintWriter;
import java.util.Scanner;

//not ready: time 1.065s
public class Task2111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] roadsLength;
        roadsLength = new int[n];

        int buff;
        int summLength = 0;
        for (int i = 0; n > i; i++){
            roadsLength[i] = in.nextInt();
            summLength = summLength + roadsLength[i];
            if (i > 0){
                if (roadsLength[i] > roadsLength[i-1]){
                    buff = roadsLength[i-1];
                    roadsLength[i-1] = roadsLength[i];
                    roadsLength[i] = buff;
                }
            }
        }

        /*int left = 0;
        int right = n - 1;
        int buff;
        while (right >= left) {
            for (int i = right; i > left ; --i){
                if (roadsLength[i-1] < roadsLength[i]){
                    buff = roadsLength[i - 1];
                    roadsLength[i - 1] = roadsLength[i];
                    roadsLength[i] = buff;
                }
            }

        }*/

        //int buff;
        for (int i = 0; i + 1< n; i++) {
            for (int j = 0; j + 1 < n; j++) {
                if (roadsLength[j + 1] > roadsLength[j]) {
                    buff = roadsLength[j + 1];
                    roadsLength[j + 1] = roadsLength[j];
                    roadsLength[j] = buff;
                }
            }

        }


        /*for (int i = 0; i < n; i++) {

        }*/

        int taxes = 0;
        for (int i = 0; i < n; i++){
            taxes = taxes + summLength * roadsLength[i] + (summLength - roadsLength[i]) * roadsLength[i];
            summLength = summLength - roadsLength[i];
        }

        out.println(taxes);
        out.flush();
    }
}
