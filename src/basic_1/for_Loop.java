package basic_1;

import java.util.Scanner;

public class for_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        int sum = 0;
        for (int i=0; i<=a; i++){
            sum+= i;

        }
        System.out.println(sum);
        System.out.println(sum);

    }
}
