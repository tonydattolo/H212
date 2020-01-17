package ClassProblems.Class2;
import java.math.BigDecimal;
/**
 * class2
 */
public class bigdecimal0 {

    public static void main(String[] args) {
        BigDecimal a, b, c;

        a = new BigDecimal("2");
        b = new BigDecimal("3");
        c = new BigDecimal("4");

        
        System.out.println(a.add(b));
        System.out.println(a.add(b.multiply(c)));
        System.out.println(a.multiply(b).add(c));
        System.out.println(a.add(a).multiply(b).divide(c).subtract(b));
        System.out.println(a.add(b.multiply(c.divide(a.subtract(b)))));

        // a.add(b);
        // a.add(b.multiply(c));
        // a.multiply(b).add(c); 2*3 6+3
        // a.add(a).multiply(b).divide(c).subtract(b); 2+2 4*3 12/4 3-3 0
        // a.add(b.multiply(c.divide(a.subtract(b))));
    }
}