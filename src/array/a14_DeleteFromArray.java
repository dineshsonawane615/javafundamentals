package array;

import java.util.Scanner;

public class a14_DeleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        int[] numArr = a10_ArrayUtility.inputArray();
        System.out.println("Now, Enter then number you want to delete");
        int numToDelete = sc.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.print("Here is your new Array : ");
        a10_ArrayUtility.displayArray(newArr);

    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = a12_OccurencesArray.noOfOccurrences(numArr, numToDelete);
        if (occ == 0) {
            return numArr;  // if i dont get element which i need then same array print
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete ) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
