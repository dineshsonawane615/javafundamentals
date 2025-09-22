package basics.practice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to sum of digits");
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("sum of Digits is " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0){
            sum = sum + (num % 10);    // sum += num % 10
            num = num / 10; // num /=10
        }
        return sum;
    }
}
