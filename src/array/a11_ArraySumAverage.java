package array;

import java.util.Scanner;

public class a11_ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum and Average : ");
        int[] numArray = a10_ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] numArray) {
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
    }
}
