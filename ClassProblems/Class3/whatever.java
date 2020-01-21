public class whatever{
    // public static long fun(int index) {
        // if (index == 1 ) return 1l;
        // else if (index == 2) return 2l;
        // else return fun(index-1) + fun(index-2);

    public static long fun(int index, long a, long b) {    
        if (index == 0 ) return b;
        else return fun(index-1, b, a+b); //accumulated passing style
        //homework01 using BigIntegers
    }
    public static void main(String[] args) {
        
    }
}