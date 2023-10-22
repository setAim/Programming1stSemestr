package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Third5B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        if (size > 0){
            int[] whatToSum = new int[size];
            Random random = new Random();
            int summa = 0;
            int counter = 0;
            int randomNumber = 0;
            boolean conditions = false;

            while (counter < size) {
                while (!conditions) {
                    randomNumber = random.nextInt(100);
                    if (randomNumber % 5 == 2) {
                        whatToSum[counter] = randomNumber;
                        summa +=whatToSum[counter];
                        counter++;
                        break;
                    }
                    if (randomNumber % 3 == 1) {
                        whatToSum[counter] = randomNumber;
                        summa +=whatToSum[counter];
                        counter++;
                        break;
                    }
                }
            }
            System.out.println("Что суммируем: " + Arrays.toString(whatToSum));
            System.out.println("Сумма: " + summa);
        } else {
          System.out.println("Не можем создать массив: некорректное значение.");
        }

    }
}
