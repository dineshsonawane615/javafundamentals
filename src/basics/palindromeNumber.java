package basics;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Number");
        System.out.println("Please enter a number");
        int num=sc.nextInt();
        int reverse = reverse(num);
        boolean isPalindrome=isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your number is a palindrome number");
        }else {
            System.out.println("Your number is not a palindrome number");
        }
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
