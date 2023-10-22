package lr3;

import java.util.Scanner;

public class Third2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите день недели (название): ");
        String s = in.nextLine();

        switch (s){
            case "Monday":
            case "monday":
            case "Mon":
            case "mon":
            case "Понедельник":
            case "понедельник":
            case "Пн":
            case "пн":
                System.out.println("Порядковый день недели: 1");
                break;
            case "Tuesday":
            case "tuesday":
            case "tue":
            case "Вторник":
            case "вторник":
            case "вт":
                System.out.println("Порядковый день недели: 2");
                break;
            case "Wednesday":
            case "wednesday":
            case "wed":
            case "Среда":
            case "среда":
            case "ср":
                System.out.println("Порядковый день недели: 3");
                break;
            case "Thursday":
            case "thursday":
            case "thu":
            case "Четверг":
            case "четверг":
            case "чт":
                System.out.println("Порядковый день недели: 4");
                break;
            case "Friday":
            case "friday":
            case "fri":
            case "Пятница":
            case "пятница":
            case "пт":
                System.out.println("Порядковый день недели: 5");
                break;
            case "Saturday":
            case "saturday":
            case "sat":
            case "Суббота":
            case "суббота":
            case "сб":
                System.out.println("Порядковый день недели: 6");
                break;
            case "Sunday":
            case "sunday":
            case "sun":
            case "Воскресенье":
            case "воскресенье":
            case "вс":
                System.out.println("Порядковый день недели: 7");
                break;
            default: System.out.println("Что это за день недели?");
        }
    }
}
