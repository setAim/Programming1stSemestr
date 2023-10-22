package lr3;

import java.util.Random;

public class Third9 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = random.nextInt(1,10);
        System.out.println("Размер массива от 1 до 10 выбран случайным образом: " + size);
        int[] array = new int[size];
        int min = 101;
        String indexOfMin = "";
        //indexOfMin = "";

        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(100);
            //System.out.println("i: " + i + ", array[i]: " + array[i]);
            System.out.print(array[i] + " ");
            if (i == 0) {
                min = array[i];
                indexOfMin = "0";
                continue;
            }
            if (array[i] < min) {
                min = array[i];
                indexOfMin = ""+i;
                continue;
            }
            if (array[i] == min) {
                indexOfMin = indexOfMin + ", " + i;
            }
        }
        System.out.println();
        System.out.println("Минимальное значение массива: " + min + ", индекс: " + indexOfMin);

    }
}
