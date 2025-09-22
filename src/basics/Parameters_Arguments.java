package basics;

 class Calculator {
    // Method with parameters
    int add(int a, int b) {   // a and b = PARAMETERS
        return a + b;
    }
}

public class Parameters_Arguments  {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        // Passing arguments
        int result = c.add(10, 20);  // 10 and 20 = ARGUMENTS

        System.out.println("Sum = " + result);
    }
}
