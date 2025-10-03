package operators;

import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator\n");
        System.out.println("Please enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Now, enter the second number: ");
        int second = sc.nextInt();

        int result = first | second;
        System.out.println("Result is: "+ result);

    }
}
