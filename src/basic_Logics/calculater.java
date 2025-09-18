package basic_Logics;

public class calculater {
    int add (int a, int b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a+b+c;
    }
    int add (int a, int b, int c, int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        calculater cals = new calculater();
        int sum1 = cals.add(5,10);
        int sum2 = cals.add(3,4,5);
        int sum3 = cals.add(3,4,5,6);
        System.out.println("Sum of two numbers: " +sum1);
        System.out.println("Sum of three numbers: " +sum2);
        System.out.println("Sum of four numbers: " +sum3);
    }
}
