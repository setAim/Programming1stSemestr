package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Third6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int amount = in.nextInt();

        if (amount > 0) {
            int[] numbers = new int[amount];
            boolean condition;
            Random random = new Random();
            int num = 0;

            for (int i = 0; i < amount; i++) {
                condition = false;
                while (!condition) {
                    num = random.nextInt(100);
                    if (num % 5 == 2) {
                        numbers[i] = num;
                        //System.out.println("i: " + i + ", num: " + num);
                        condition = true;
                    }
                }
            }
            System.out.println(Arrays.toString(numbers));
        } else {
            System.out.println("Ошибка. Перезапустите программу и введите корректное значение.");
        }
    }
}
