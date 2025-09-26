package array;

import java.util.Scanner;

public class a12_OccurencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Array Occerences\n");
        int[] numArr = a10_ArrayUtility.inputArray();
        System.out.println("Now neter the number yo want to find: ");
        int num = input.nextInt();
        int Occurrences = noOfOccurrences(numArr, num);
        System.out.println("Your element was found " + Occurrences + " times in the array");
        printIndexes(numArr, Occurrences);
    }

    public static int noOfOccurrences(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }

    //Prints indexes of all accurences
    public static void printIndexes(int[] numArr, int num) {
        System.out.println("Found at indexes: ");
        for (int i = 0; i < numArr.length; i++ ) {
            if (numArr[i] == num ) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); //new line
    }
}
 