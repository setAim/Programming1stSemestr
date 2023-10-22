package lr4;

import java.util.Random;

public class Fourth7 {
    public static void main(String[] args) {
        int number = -1;
        Random random = new Random();
        int n = random.nextInt(5) + 1;
        int m = random.nextInt(5) + 1;
        int[][] array = new int[n][m];
        int i;
        int j;

        for (i = 0; i < n; i++){
            if (i % 2 == 0){
                for (j = 0; j < m; j++){
                    number++;
                    array[i][j] = number;
                }
            } else {
                for (int k = m-1; k > -1; k--){
                    number++;
                    array[i][k] = number;
                }
            }
        }

        for (i = 0; i < n; i++){
            for (j = 0; j < m; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
