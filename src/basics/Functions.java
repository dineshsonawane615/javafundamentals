package basics;

// functions / methods
public class Functions {
    public static void main(String[] args) {
        System.out.println("In main Method ");
        greeting();
        System.out.println("Method calling complete");

        printFirstPattern();
        printSecondPattern();

        System.out.println();
        printThirdPattern();
    }

    public static void greeting() {
        System.out.println("Good Morning Maharashtra ");
    }

    public static void printFirstPattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSecondPattern() {
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printThirdPattern() {
        int rows = 0;
        while (rows < 10) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}

