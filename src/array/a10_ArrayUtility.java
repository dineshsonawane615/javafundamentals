package array;

import java.util.Scanner;

public class a10_ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Please enter the number elements : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element number" + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;
    }

    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Please enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print ("Please enter the number of columns : ");
        int columns = sc.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
        while (i < rows) {
            int j =0;
            while (j < columns) {
                System.out.print("Please enter element row:" + (i + 1)
                        + ", column: " + (j+1) + " :");
                numArray[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

    public static void displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
