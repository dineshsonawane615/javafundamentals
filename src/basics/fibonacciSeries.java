package basics;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci series");
        System.out.println("Please enter a number up to which series has to be printed");
        int num = input.nextInt();
        printSeries(num);
    }

    public static void printSeries(int num){
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;

        int first = 0, second = 1;
        while (first + second <= num) {
            int third =  first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
