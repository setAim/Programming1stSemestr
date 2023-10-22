package lr3;

import java.util.Scanner;

public class Third3While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в последовательности Фибоначчи: ");
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("Количество не может быть отрицательным!");
            return;
        }
        if (n == 0) {
            System.out.println("Нет последовательности Фибоначчи.");
            return;
        }
        if (n == 1) {
            System.out.println("1");
            return;
        }
        if (n == 2) {
            System.out.println("1 1");
            return;
        }

        int k = 0;
        int[] seq = new int[n];
        while (k != n){
            if (k == 0){
                seq[k] = 1;
                System.out.print("Последовательность Фибоначчи из " + n + " чисел: " + seq[k] + " ");
                k++;
                continue;
            }
            if (k == 1){
                seq[k] = 1;
                System.out.print(seq[k] + " ");
                k++;
                continue;
            }
            seq[k] = seq[k-2] + seq[k-1];
            System.out.print(seq[k] + " ");
            k++;
        }
    }
}
