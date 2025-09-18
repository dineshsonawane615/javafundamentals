package basic_Logics;

public class nth_term_of_AP {
    public static int nthTermOfAP(int a1, int a2, int n){
    int nthterm = a1, d = a2 - a1;
    for (int i = 1; i < n; i++){
        nthterm += d;
    }
    return nthterm;
    }

    public static void main(String[] args)
    {
        int a1 = 2, a2 = 3;
        int n = 10;
        System.out.println(nthTermOfAP(a1, a2, n));
    }
}

