package ClassProblems.Class3;

import java.math.BigInteger;/**
 * Rutabega
 */
public class Rutabega {

    public static BigInteger fun(BigInteger index) {
        return index.add(new BigInteger("1"));
        
    }
    public static void main(String[] args) {
        BigInteger result = Rutabega.fun(new BigInteger("9223372036854775807"));
        System.out.println(result);

        // System.out.println(Rutabega.fun("1"));
    }
}