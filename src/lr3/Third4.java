package lr3;

import java.util.Scanner;

public class Third4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 2 числа: ");
        int a = in.nextInt();
        int b = in.nextInt();

        if (a == b) {
            System.out.println(a + " " + b);
            return;
        }
        if (a > b) {
            sequenceOfInt(b, a);
            return;
        }
        if (a < b) {
            chainOfInt(a, b);
        }
    }

    public static void sequenceOfInt(int x, int y) {
        int run = x + 1;
        System.out.print("Числа от " + x + " до " + y + ": " + x + " ");
        while (run <= y) {
            if (run == y) {
                System.out.print(run);
                run++;
            } else {
                System.out.print(run + " ");
                run++;
            }

        }
        return;
    }

    public static void chainOfInt(int m, int n) {

        System.out.print("Числа от " + m + " до " + n + ": " + m + " ");
        for (int i = m + 1; i <= n; i++){
           if (i == n){
               System.out.println(i);
               return;
           }
            System.out.print(i + " ");
        }
        return;
    }
}
