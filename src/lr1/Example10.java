package lr1;

import java.util.Scanner;

//self made task 5
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input year of birth: ");
        int birthYear = in.nextInt();

        int age = 2023 - birthYear;

        System.out.println("Your age: " + age);

        in.close();
    }
}
