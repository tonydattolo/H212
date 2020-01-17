// Page 24: R1.7, R1.8, R1.9
// Page 25: R1.13, R1.14, R1.19
// Page 26: E1.11, E1.15
// Page 27: E1.16, E1.17, E1.18
// Page 28: P1.3
package BookProblems;

/**
 * Week1_class2
 */
public class Week1_class2 {

    // R1.7
    public static void main(String[] args) {
        System.out.println("======");
        System.out.println("39 + 3");
        System.out.println(39 + 3);
        test();
        // test2();
        test3();
    }
    // R1.8
    public static void test() {
        System.out.println("======");
        System.out.print("Hello");
        System.out.println("World");
    }

    // R1.9  compile time error: exception in thread "main" java: method print.. in type printstream not applicable for arguments (String, String)
    // public static void test2() {
    //     System.out.println("Hello", "world");
    // }

    // R1.13
    
    // R1.14
    // R1.19

    public static void test3() {
        System.out.println("===============");
        System.out.println("   -----   " + "  /\\_/\\   ");
        System.out.println(" / holaa \\ " + " ( ' ' )   ");
        System.out.println("| junior  > " + "( \\_/ )  ");
        System.out.println(" \\ coder!/ " + "  | | |  ");
        System.out.println("   -----   " + "  (_|_)   ");
    }
    
}

