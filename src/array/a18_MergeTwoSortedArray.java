package array;

import java.util.Arrays;

public class a18_MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Merging Sorted Arrays\n");
        int[] arr1 = a10_ArrayUtility.inputArray();
        int[] arr2 = a10_ArrayUtility.inputArray();
        int[] mergedArr = merge(arr1, arr2);
        System.out.println("The merged array is: ");
        a10_ArrayUtility.displayArray(mergedArr);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length ||
                    ( i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];
                i++;
                k++;
            }else {
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}
