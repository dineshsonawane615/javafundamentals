package basic_1;

public class leap_year {
    private static String notALeapYear;

    public static void main(String[] args) {
        /*The leap year rule is: A year is a leap year if :
        It is divisible by 4, but not divisible by 100, unless it is also divisible by 400.*/
        int year = 2016;
        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // If it is divisible by 100, then check if it's also divisible by 400
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    // If divisible by 400, it's a leap year
                    System.out.println("Leap year");
                } else {
                    // Divisible by 100 but not 400 → not a leap year
                    System.out.println("Not a leap year");
                }
            } else {
                // Divisible by 4 but not 100 → leap year
                System.out.println("Leap year");
            }
        } else {
            // Not divisible by 4 → not a leap year
            System.out.println("Not a leap year");
        }
    }
}
