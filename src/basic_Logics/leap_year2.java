package basic_Logics;

class leap_Year {
    public static void main(String[] args) {
        int year = 2016;
        if ((year %4 == 0) || (year %400 ==0 && year %100 != 0)){
            System.out.println("leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }

}
