package lr3;

import java.util.Arrays;
import java.util.Random;

public class Third10 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = random.nextInt(1,10);
        System.out.println("Размер массива от 1 до 10 выбран случайным образом: " + size);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(500);
        }
        System.out.println("Изначальный массив: " + Arrays.toString(array));

        int buff;
        //bubble sort
        for (int i = 0; i <= size - 2; i++) {
            for (int j = 0; j <= size - i - 2; j++){
                if (array[j] < array[j+1]) {
                        buff = array[j];
                        array[j] = array[j+1];
                        array[j+1] = buff;
                }
            }
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
