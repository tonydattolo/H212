package ClassProblems.Class2;

import java.math.BigDecimal;

/**
 * bigdecimal1
 */
public class bigdecimal1 {

    public static void main(String[] args) {
        BigDecimal a,b,c;
        a = new BigDecimal("10");
        b = new BigDecimal("2");
        c = new BigDecimal("3");

        System.out.println( a.add(b) ); //10 + 2
        BigDecimal result;
        result = (new BigDecimal("10").add(b.multiply(c)));
        System.out.println(result);
        // result = (new BigDecimal("10")
        // System.out.println(result);
        // result = (new BigDecimal("10")
        // System.out.println(result);
        // result = (new BigDecimal("10")
    }
}