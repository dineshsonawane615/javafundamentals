package ifEelse_Loops_swithCase;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //While Loop
        System.out.println("While loop");
        int num = 1;  // Initialization
        while (num <= 10) { //Condition
            System.out.println(num); // Actual work
            num += 1; //Updating the condition
        }


//        int count = 500;
//        while (count >= 200){
//            System.out.println(count);
//            count = count - 1;
//        }

        //For Loop
        System.out.println("for loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);  // prints 1 to 5
        }

        //do-While Loop
        System.out.println("do-while Loop");
        int r = 1;
        do {
            System.out.println(r);
            r++;
        } while (r <= 5);

        //for-each loop -> Used to iterate over arrays/collections.
        System.out.println("for-each loop");
        int[] nums = {10, 20, 30};
        for (int n : nums) {
            System.out.println(n);
        }

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            System.out.println("Enter an integer: ");
            int scs = sc.nextInt();
            System.out.println("Number is : "+scs);
            i++;
        }
    }
}
