package basic_Logics;

public class switch2 {
    public static void main(String[] args) {
        int no1=10 , no2 =20, res;
        String sym="+";
        switch (sym){
            case"+":
                res=no1+no2;
                System.out.println(res);
                break;
            case"-":
                res=no1-no2;
                System.out.println(res);
                break;
            default:
                System.out.println("Invalid Symbol");
                break;
        }
    }
}
