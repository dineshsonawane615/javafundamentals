package basic_Logics;

import java.util.Scanner;

public class ifElseIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter your age..!");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible for voting..");
        }
        else if(age>=18)
        {
            System.out.println("You are an adult.");
        }
        else if(age > 12 && age < 18){
            System.out.println("You are a teenager.");
            System.out.println("Not eligible for Vote.....");
        }else{
            System.out.println("Not eligible for Vote.....");
        }
    }
}
