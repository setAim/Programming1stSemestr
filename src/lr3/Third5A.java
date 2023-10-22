package lr3;

import java.util.Random;
import java.util.Scanner;

public class Third5A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел, сумму которых надо посчитать: ");
        int n = in.nextInt();

        if (n > 0) {
            int[] numbers = new int[n];
            Random random = new Random();
            int check = 0;
            int summ = 0;

            for (int i = 0; i < n; i++) {
                while ((check % 5 != 2) && (check % 3 != 1)) {
                    check = random.nextInt(100);
                }
                numbers[i] = check;
                check = 0;
                if (i == 0) {
                    System.out.print("Просуммируем числа: " + numbers[i] + " + ");
                } else if (i == n - 1) {
                    System.out.print(numbers[i] + " = ");
                } else {
                    System.out.print(numbers[i] + " + ");
                }
                summ = summ + numbers[i];
            }
            System.out.println(summ);
        } else {
            System.out.println("Нельзя суммировать отрицательное или нулевое количество чисел.");
        }

    }
}
