package lr1;

import java.util.Scanner;

//self made task 3
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*System.out.println("Input day of week: ");
        String dayOfWeek = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input date: ");
        int dayNumber = in.nextInt();

        System.out.println("Today is " + dayOfWeek + ", " + dayNumber + " " + month);*/
        System.out.println("Input day of week, month and date separated by space: ");
        String inputDate = in.nextLine();

        int i = 3;
        String[] dateArray = inputDate.split(" ", i);

        System.out.println(dateArray[0] + ", " + dateArray[2] + " " + dateArray[1]);

        in.close();
    }
}
