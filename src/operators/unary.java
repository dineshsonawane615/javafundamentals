package operators;

public class unary {
    public static void main(String[] args) {
        int a = 1;
        int b = -a;
        int c = -b;
        System.out.println(c);

        int x = 5;
        x = x + 1;
        System.out.println(x);
        x += 1;
        System.out.println(x);
        x++;
        System.out.println(x);

//        System.out.println("Watching increment" );
//        System.out.println(x++);
//        System.out.println(x);
//        System.out.println(++x);   //mostly confusion occurs
    }
}
