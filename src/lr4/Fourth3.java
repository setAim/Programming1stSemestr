package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Fourth3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите стороны прямоугольника (строки, столбцы): ");
        int a = in.nextInt();
        int b = in.nextInt();

        if (a > 0) {
            if (b > 0){
                char[][] rectangle = new char[a][b];
                for (int i = 0; i < a; i++){
                    for (int j = 0; j < b; j++){
                        if ((i == 0)||(i == a - 1)){
                            rectangle[i][j] = '2';
                            System.out.print(rectangle[i][j]);
                            continue;
                        }
                        if ((j == 0)||(j == b - 1)){
                            rectangle[i][j] = '2';
                            System.out.print(rectangle[i][j]);
                            continue;
                        }
                        rectangle[i][j] = 32;
                        System.out.print(rectangle[i][j]);
                    }
                    System.out.println();
                }
                //System.out.println(Arrays.deepToString(rectangle));
            }
            else {
                System.out.println("Вторая сторона прямоугольника отрицательная или равна 0!");
            }
        }
        else {
            System.out.println("Вы ввели отрицательное число или 0.");
        }
    }
}
