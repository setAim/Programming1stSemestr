package lr4;

public class Fourth1 {
    public static void main(String[] args) {
        int figure = 11;
        char space = 32;
        char hor = '-';
        char cor = '+';
        char ver = '|';


        for (int i = 1; i <= figure; i++) {
            //System.out.print("номер строки: " + i + " ");
            for (int j = -12; j < figure; j++) {
                if ((j == -12)||(j == figure - 1)){
                    if ((i == 1)||(i == figure)){
                        System.out.print(cor);
                    } else
                    {
                        System.out.print(ver);
                    }
                } else {
                    if ((i == 1)||(i == figure)){
                        System.out.print(hor);
                    } else
                    {
                        System.out.print(space);
                    }
                }

            }
            System.out.println();
            //System.out.println(" Количество символов в строке " + z);
        }
    }
}
