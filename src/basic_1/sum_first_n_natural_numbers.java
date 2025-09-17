package basic_1;

public class sum_first_n_natural_numbers {

    public static int find_sum(int n){
        int sum=0;
        for (int i=1; i<=n; i++)
            sum = sum+i;
            return sum;

        // Using mathematical formula to compute
        // sum of first n natural numbers
//        return n * (n + 1) / 2;
    }

    public static void main(String[] args){
        int n=10;
        System.out.println(find_sum(n));
    }
}
