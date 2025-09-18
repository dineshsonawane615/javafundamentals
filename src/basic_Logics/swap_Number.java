package basic_Logics;

public class swap_Number {
    public static void main(String[] args) {

        //With Third variable
        int a=10, b=20;

        int temp = a;
        a=b;
        b=temp;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("-------------------------------------");

        //With Third variable  (here a=20, b=10)
        a= a + b;     //10+20=30
        b= a - b;     //30-20=20
        a= a - b;     //30-20=10
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("-------------------------------------");

        // Java Code to swap two numbers using bitwise XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}