package lr4;

public class Fourth4 {
    public static void main(String[] args) {
        int figure = 15;
        char space = 32;
        char hor = '-';
        char cor = '+';
        char ver = '|';
        char diag = '/';
        char[][] triangle = new char[figure][figure];

        for (int i = 0; i < figure; i++) {
            for (int j = 0; j < figure; j++) {
                if (i == 0) {
                    if (j == figure - 1) {
                        triangle[i][j] = cor;
                    } else {
                        triangle[i][j] = space;
                    }
                    continue;
                }
                if (i == figure - 1){
                    if (j == 0) {
                        triangle[i][j] = cor;
                        continue;
                    }
                    if (j == figure - 1) {
                        triangle[i][j] = cor;
                        continue;
                    }
                    triangle[i][j] = hor;
                    continue;
                }
                if (j == figure - 1) {
                    triangle[i][j] = ver;
                    continue;
                }
                if (j == figure - i - 1){
                    triangle[i][j] = diag;
                    continue;
                }
                triangle[i][j] = space;
            }
        }

        for (int i = 0; i < figure; i++){
            for (int j = 0; j < figure; j++){
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}
