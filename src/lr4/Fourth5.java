package lr4;

import java.util.Random;

public class Fourth5 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10) + 1;
        int m = random.nextInt(10) + 1;
        int[][] original = new int[n][m];
        int[][] transposed = new int[m][n];

        System.out.println("Исходный массив со сторонами " + n + " и " + m + ": ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                original[i][j] = random.nextInt(100);
                transposed[j][i] = original[i][j];
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспонированный массив со сторонами " + m + " и " + n + ": ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
