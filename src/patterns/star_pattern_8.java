package patterns;

public class star_pattern_8 {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }

          /*  for (int k=4; k>=i; k--){
                System.out.print("*");
            }
            for (int l=3; l>=i; l--){
                System.out.print("*");
            }*/

            //Insted of using fourth loop, we can also use
            for (int k=9; k>(i*2); k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
