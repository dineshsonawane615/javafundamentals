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
}
