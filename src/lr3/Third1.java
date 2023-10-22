package lr3;

import java.util.Scanner;

public class Third1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите номер дня недели: ");
        int n = in.nextInt();

        switch (n){
            case 1:
                System.out.println("Это понедельник!");
                break;
            case 2:
                System.out.println("Это вторник!");
                break;
            case 3:
                System.out.println("Это среда!");
                break;
            case 4:
                System.out.println("Это четверг!");
                break;
            case 5:
                System.out.println("Это пятница!");
                break;
            case 6:
                System.out.println("Это суббота!");
                break;
            case 7:
                System.out.println("Это воскресенье!");
                break;
            default: System.out.println("Число не в диапазоне от 1 до 7, мы не знаем, что это за день недели.");
        }
    }
}
