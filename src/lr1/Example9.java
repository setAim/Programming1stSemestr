package lr1;

import java.util.Scanner;

//self made task 4
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input amount of days in this month: ");
        int days = in.nextInt();

        char isUserRight;
        int rightDaysAmount = 0;

        switch (month) {
            case    "january":
            case    "march":
            case    "may":
            case    "july":
            case    "august":
            case    "october":
            case    "december":
                if (days == 31){
                    isUserRight = 1;
                } else {
                    isUserRight = 0;
                    rightDaysAmount = 31;
                }
                break;
            case    "february":
                if (days == 28){
                    isUserRight = 1;
                } else {
                    isUserRight = 0;
                    rightDaysAmount = 28;
                }
                break;
            case    "april":
            case    "june":
            case    "september":
            case    "november":
                if (days == 30){
                    isUserRight = 1;
                } else {
                    isUserRight = 0;
                    rightDaysAmount = 30;
                }
                break;
            default:
                isUserRight = 1;
        }

        /*switch (days){
            case 28:
            case 29:
                if ((month.equals("february") || (month.equals("February") || (month.equals("feb") || (month.equals("Февраль") || (month.equals("февраль") || (month.equals("фев")){
                    isUserRight = true;
                 } else {
                    isUserRight = false;
            }
        }

        if ((month.equals("january")) || (month.equals("february")){

        }*/

        switch (isUserRight){
            case 1:
                System.out.println("Month "+ month + " has "+ days +" days.");
                break;
            case 0:
                if (rightDaysAmount == 28) {
                    System.out.println("Month "+ month + " has "+ days +" days. But we think it has 28 or 29 days usually.");
                } else{
                    System.out.println("Month "+ month + " has "+ days +" days. But we think it has " + rightDaysAmount);
                }
                break;
            default:
                System.out.println("Month "+ month + " has "+ days +" days. Something might be off, but we don't know what.");
        }

        in.close();
    }
}
