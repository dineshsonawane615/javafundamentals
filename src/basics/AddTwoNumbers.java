package basics;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("take your answer");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum is "+sum);
    }
}
