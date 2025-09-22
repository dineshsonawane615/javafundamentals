package basics;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        grret();
        int first = readnumber();
        int second = readnumber();

        int sum = first + second;
        System.out.println("Sum of the number is: " + sum);
    }

    public static int readnumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        return number;
    }

    public static void grret() {
        System.out.println("Welcome to Calculator");
    }
}

