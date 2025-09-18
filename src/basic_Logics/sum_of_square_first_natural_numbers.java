package basic_Logics;

public class sum_of_square_first_natural_numbers {

    public static int summation(int n)
    {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += (i * i);
        }
            return sum;
    }

    public static void main (String args[])
    {
        int n = 10;
        System.out.println(summation(n));
    }
}
