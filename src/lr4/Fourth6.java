package lr4;

import java.util.Random;

public class Fourth6 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10) + 1;
        int m = random.nextInt(10) + 1;
        int[][] original = new int[n][m];
        int[][] cut = new int[n-1][m-1];
        int nCut = random.nextInt(n);
        int mCut = random.nextInt(m);

        System.out.println("Массив размера " + n + " на " + m +", из которого вырежем строку с индексом " + nCut + " и столбец с индексом " + mCut);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                original[i][j] = random.nextInt(10);
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Массив с удаленной строкой (индекс " + nCut + ") и удаленным столбцом (индекс " + mCut + "):");
        for (int i = 0; i < n; i++) {
            if (i == nCut){
                continue;
            }
            for (int j = 0; j < m; j++) {
                if (j == mCut){
                    continue;
                }
                if (i < nCut){
                    if (j < mCut){
                        cut[i][j] = original[i][j];
                        System.out.print(cut[i][j] + " ");
                    }
                    else {
                        cut[i][j-1] = original[i][j];
                        System.out.print(cut[i][j-1] + " ");
                    }
                }
                if (i > nCut){
                    if (j < mCut){
                        cut[i-1][j] = original[i][j];
                        System.out.print(cut[i-1][j] + " ");
                    }
                    else {
                        cut[i-1][j-1] = original[i][j];
                        System.out.print(cut[i-1][j-1] + " ");
                    }
                }

            }
            System.out.println();
        }

    }
}
