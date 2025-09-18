package basic_Logics;

public class reverse_string {
    public static void main(String[] args) {
        String name = "deepak";
        //int long = name.length();
        String rev = " ";
        for (int i=name.length() -1; i>=0; i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
    }
}
