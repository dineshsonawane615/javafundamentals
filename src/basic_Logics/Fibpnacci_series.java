package basic_Logics;

public class Fibpnacci_series {
    public static void main(String[] args) {
        int a=0, b=1;
        int c ;
        for(int i=1; i<=10; i++){
            c=a+b;
            System.out.println(a + " + " + b + " = " + c);
            a=b;
            b=c;
        }
    }
}
/*The Fibonacci series is a sequence of numbers where:
Each number is the sum of the two numbers before it.
                {Fibonacci series starts with 0 and 1.
        Each new number is the sum of the previous two numbers.}

It goes like: 0, 1, 1, 2, 3, 5, 8, 13... and so on.
Fibonacci Example:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Then:
        0 + 1 = 1
        1 + 1 = 2
        1 + 2 = 3
        2 + 3 = 5
        3 + 5 = 8
        5 + 8 = 13*/
