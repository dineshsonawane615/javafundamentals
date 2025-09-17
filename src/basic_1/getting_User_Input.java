package basic_1;

import java.util.Scanner;

public class getting_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :");
        String name = sc.next();
        System.out.println("Enter Gender :");
        char gender = sc.next().charAt(0);
        System.out.println("Enter Age :");
        int age = sc.nextInt();
        System.out.println("Enter Phone_No. :");
        long phone_no = sc.nextLong();

        System.out.println("-------------------------------");
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("Phone_No. : "+phone_no);
    }
}
