package basic_Logics;

public class armstrong_number {
    public static void main(String[] args) {
        int no = 153;      //is a armstrong number
       // int no = 123;   // not a armstrong number
        int t1 = no; int length =0;
        while (t1 != 0){
            t1 = t1/10;
            length = length + 1;
        }
        System.out.println(length+ " is the length of the digits");

        int t2 = no;
        int rem, arm = 0;

        //Calculate the sum of the digit raised to the power of 'length'
        while (t2 != 0){
            rem = t2 % 10;
            arm += Math.pow(rem, length); // Math.pow returns a double, auto cast to here
            t2 = t2 / 10;
        }

        //check if Armstrong
        if (arm == no){
            System.out.println(no + " is an Armstrong number");
        }else {
            System.out.println(no + " is not an Armstrong number");
        }
    }
}

/*
    An Armstrong number (also known as a narcissistic number) is a number
    that is equal to the sum of its digits each raised to the power of the number of digits.
    Example 1: 153     , 9474 is armsrong number
    It has 3 digits.
    Digits: 1, 5, 3
    Check: 1³ + 5³ + 3³ = 1 + 125 + 27 = 153

    123 is not a armstrong number
 */