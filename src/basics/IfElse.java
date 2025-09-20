package basics;

public class IfElse {
    public static void main(String[] args) {
        // Simple if-else
        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        System.out.println("------------------------------------");
        // if-else if Ladder
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        System.out.println("------------------------------------");
        // Nested if
        int num = 10;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        }


    }
}
