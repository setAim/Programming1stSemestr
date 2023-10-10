package lr1;

import java.util.Scanner;

//self made task 9
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        float a = in.nextFloat();

        //System.out.println("Result: " + (a-1) + "; " + a + "; " + (a+1) + "; " + ((a-1 + a + a+1)*(a-1 + a + a+1)));
        System.out.println("Result: " + (a-1) + "; " + a + "; " + (a+1) + "; " + (a*a*9));
    }
}
