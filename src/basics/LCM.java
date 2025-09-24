package basics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Please enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int b = sc.nextInt();
        int lcm = lcm(a,b);
        System.out.println("LCM is: " + lcm);
    }

    public static int lcm(int a, int b){
        int i = 1;
        while (i <= b) {
            int factor = a * i;
            if (factor % b == 0) {
                return factor;
            }
            i++;
        }
        return 0; // unreachable
    }
}

// word occurence in a string code
// vowels in a string