package basics.practice;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to multiplication World\n");
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num) {
        int i =1;
        while(i<=10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}
