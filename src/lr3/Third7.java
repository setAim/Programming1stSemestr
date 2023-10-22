package lr3;

import java.util.Arrays;

public class Third7 {
    public static void main(String[] args) {
        char[] letters = new char[10];
        letters[0] = 'a';
        letters[1] = 'c';
        letters[2] = 'e';
        letters[3] = 'g';
        letters[4] = 'i';
        letters[5] = 'k';
        letters[6] = 'm';
        letters[7] = 'o';
        letters[8] = 'q';
        letters[9] = 's';

        System.out.println("Массив в прямом порядке: " + Arrays.toString(letters));

        for (int i = 9; i > -1; i--) {
            if (i == 9) {
                System.out.print("Массив в обратном порядке: " + letters[i]);
                continue;
            }
            System.out.print(" " + letters[i]);
        }
    }
}
