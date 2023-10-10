package lr1;

import java.util.Scanner;

//self made task 6
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input year of birth: ");
        int birthYear = in.nextInt();

        int age = 2023 - birthYear;

        System.out.println(name + "! Your age: " + age);

        in.close();
    }
}
