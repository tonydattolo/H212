package ClassProblems.Class3;

/**
 * fib0
 */
public class fib0 {

    private static long[] f = new long[92];

    public static long fib(int n){
        if (n == 0) 
            return 0;
        if (n == 1)
            return 1;
        if (f[n] > 0)
            return f[n];
        
        f[n] = fib(n-1) + fib(n-2);
        return f[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}