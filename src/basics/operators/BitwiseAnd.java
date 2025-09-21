package basics.operators;

import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator\n");
        System.out.println("Please enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Now, enter the second number: ");
        int second = sc.nextInt();

        int result = first & second;
        System.out.println("Result is: "+ result);

    }
}

/*
    Decimal         Binary
    0               0000
    1               0001
    2               0010
    3               0011
    4               0100
    5               0101
    6               0110
    7               0111
    8               1000
    9               1001
    10              1010
    11              1011
    12              1100
    13              1101
    14              1110
    15              1111
    */
