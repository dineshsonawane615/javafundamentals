package basics;

import java.util.Scanner;

public class GCD {
    //Greatest Common Divisor -The GCD of two integers a and b is the largest positive integer
    // that divides both a and b without remainder.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Please enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int second = sc.nextInt();
        int gcd = gcd(first, second);
        System.out.println("GCD of the number is: " + gcd);
    }

    public static int gcd(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if(num1 < num2) {
            return num1;
        }else {
            return num2;
        }
    }
}
