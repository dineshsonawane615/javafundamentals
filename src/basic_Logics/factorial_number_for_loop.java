package basic_Logics;

public class factorial_number_for_loop {
    public static void main(String[] args) {

        // by using for loop
        int no = 5;
        int fact = 2;
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println(fact);


        // by using while loop
   /*   int no = 5;
        int fact = 1;
        int i = 1;

        while (i <= no) {
        fact = fact * i;
        i++;
        }

        System.out.println(fact); // Output: 120
    */

    // by using do-while loop
/*      int no = 5;
        int fact = 1;
        int i = 1;

        do {
            fact = fact * i;
            i++;
        } while (i <= no);

        System.out.println(fact); // Output: 120
*/

    }
}
