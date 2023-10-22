package lr3;

//import java.io.PrintWriter;
import java.util.Scanner;

public class Third3For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //PrintWriter out = new PrintWriter(System.out);

        System.out.println("Введите количество чисел в последовательности Фибоначчи: ");
        int n = in.nextInt();
        if (n < 0){
            System.out.println("Количество не может быть отрицательным!");
        } else {
            switch (n) {
                case 0: {
                    System.out.println("Нет последовательности Фибоначчи.");
                    break;
                }
                case 1: {
                    System.out.println("1");
                    break;
                }
                case 2: {
                    System.out.println("1 1");
                    break;
                }
                default: {
                    int[] seq = new int[n];
                    seq[0] = 1;
                    seq[1] = 1;
                    for (int i = 2; i < n; i++) {
                        seq[i] = seq[i-2] + seq[i-1];
                    }
                    System.out.print("Последовательность Фибоначчи (" + n + " первых чисел): ");
                    for (int j = 0; j < n; j++){
                        if (j == (n-1)) System.out.print(seq[j]);
                        else System.out.print(seq[j] + " ");
                    }
                    break;
                }
            }
        }
    }
}
