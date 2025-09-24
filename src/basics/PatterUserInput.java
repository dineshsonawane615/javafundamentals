package basics;

import java.util.Scanner;

public class PatterUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We are here to print patterns\n");
        System.out.println("Please enter the number of rows: ");
        int rows = sc.nextInt();
        printFirstPattern(rows);
    }

    //RightHalfPyramid
    public static void printFirstPattern(int maxRow) {
        int rows = 0;
        while (rows < maxRow) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

    }
}
