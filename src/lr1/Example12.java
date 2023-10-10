package lr1;

import java.util.Scanner;

//self made task 7
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        System.out.println("You were born in " + (2023 - age));

        in.close();
    }
}
