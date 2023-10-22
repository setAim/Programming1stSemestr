package lr4;

public class Fourth2 {
    public static void main(String[] args) {
        int figure = 15;
        char space = 32;
        char hor = '-';
        char cor = '+';
        char ver = '|';
        char diag = '/';

        for (int i = 1; i <= figure; i++) {
            for (int j = 1; j <= figure; j++) {
                if (i == 1) {
                    if (j == figure) {
                        System.out.print(cor);
                    } else {
                        System.out.print(space);
                    }
                    continue;
                }
                if (i == figure){
                    if (j == 1) {
                        System.out.print(cor);
                        continue;
                    }
                    if (j == figure) {
                        System.out.print(cor);
                        continue;
                    }
                    System.out.print(hor);
                    continue;
                }
                if (j == figure) {
                    System.out.print(ver);
                    continue;
                }
                if (j == figure - i + 1){
                    System.out.print(diag);
                    continue;
                }
                System.out.print(space);
            }
            System.out.println();
        }
    }
}
