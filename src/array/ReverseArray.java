package array;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal\n");
        int[] numArr = a10_ArrayUtility.inputArray();
        reverseArray(numArr);
        System.out.println("Your reverse array is");
        a10_ArrayUtility.displayArray(numArr);
    }

    public static void reverseArray(int[] arr){
        int i =0;
        while (i < arr.length/2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
