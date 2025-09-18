package basic_Logics;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {

       // int a;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
         int sum=0;
         int i=1;
         while (i<=a){
           sum += i;   // when a=3, 1=1, 1+2=3, 3+3=6
           i++;
        }
        System.out.println(sum);

    }
}
