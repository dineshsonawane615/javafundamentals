package Java.Chapter_2;

import java.util.Scanner;

public class minimum_number_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        minimum_number_ternary ternary = new minimum_number_ternary();
        int min = ternary.min(num1, num2);
        System.out.println("Minimum Number is: " +min);
    }

    public static int min(int num1, int num2){
        return num1 < num2 ? num1 : num2;

//         if (num1 < num2){
//             return num1;
//         }else {
//             return num2;
//         }
    }
}
