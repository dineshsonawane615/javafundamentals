package basic_Logics;

public class palindrome_Number {
    public static void main(String[] args) {
        int no =121;
        int temp = no;
        int rev=0, rem;
        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        if(no == rev)
        {
            System.out.println(no+" is a palindrome Number");
        }
        else{
            System.out.println(no+" is not a palindrome Number");
        }
    }
}

    /*
        A palindrome number is a number that reads the same forward and backward
           Example :- 121 - same forward and backward is palindriome
                      123 - not a palindrome
                      1331- ia a palindrome
    */