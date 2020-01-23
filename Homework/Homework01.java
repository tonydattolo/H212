package Homework;
import java.math.BigInteger;
import java.util.*;

public class Homework01 {

    private static BigInteger x = new BigInteger("1");
    public static void main(String[] args) {
        // Scanner for terminal number input 
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter # for Fibonacci Computation: ");
        // int number = scan.nextInt();
        // System.out.println("Fibonacci of " + number + ": " + fib(number));

        // Fixed variable for debugging
        // String number = "34";

        // Command Line Argument input
        String number = args[0];
        int n = Integer.parseInt(number);
        System.out.println(fib(n));

    }
    public static BigInteger fib(int index){
        if (index == 0) return x;
        else if (index == 1) return x;
        return fibHelper(1,index,x,x);
        
    }
    public static BigInteger fibHelper(int location, int target, BigInteger a, BigInteger b){
        if (location == target) return b;
        else{
            return fibHelper(location + 1, target, b, a.add(b));
        }
    }
}