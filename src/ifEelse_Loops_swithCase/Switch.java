package ifEelse_Loops_swithCase;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Day of the week detector");
        System.out.println(("Enter your Day in number"));
        int day = sc.nextInt();
//        oldSwitch(day);
        newSwitch(day);
    }

    public static void newSwitch(int day){
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "holiday";
            default -> "Invalid day";
        };
        System.out.println(dayStr);

        //1. Enhanced Switch: Java 12 introduced enhancements like yield and multiple constants per case.
        //2. Switch Expression: From Java 14, switch can return a value using yield.
    }

    public static void oldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7: // fall through // i show on both day it's a short way
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
