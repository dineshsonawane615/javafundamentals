package basic_1;

public class Do_While_Loop {
    public static void main(String[] args) {
        // Step 1: Initialize a variable i with value 1
        int i = 1;

        // Step 2: Start of the do-while loop
        // The code inside the 'do' block will execute at least once
        do {
            // Step 3: Print the current value of i
            System.out.println("Number: " + i);

            // Step 4: Increment the value of i by 1
            i++;

            // Step 5: Check the condition after executing the block
            // If condition (i <= 5) is true, loop continues
            // If false, loop stops
        } while (i <= 5); // Step 6: Condition check happens after the block
    }
}