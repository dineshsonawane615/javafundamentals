package basic_1;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        //int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("You are adult");
        }
        else{
            System.out.println("You are a minor");
        }
    }

}