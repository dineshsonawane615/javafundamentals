package operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcomr to number checker");
        System.out.println("Please Enter first number");
        int num1 = sc.nextInt();
        System.out.println("now, Enter a second number");
        int num2 = sc.nextInt();

//        int greaterNumber;
//        if (num1 > num2) {
//            greaterNumber = num1;
//        } else {
//            greaterNumber = num2;
//        }

//        variable = (condition) ? value_if_true : value_if_false;
        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greatest number");
    }
}
