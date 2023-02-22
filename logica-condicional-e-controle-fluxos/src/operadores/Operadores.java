package operadores;

public class Operadores {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int i = 10;
        int i2 = 20;

        float f = 1.74f;
        float f2 = 1.45f;

        double d = 2.46d;

        char c = 'M';
        char c2 = 'F';

        String s = "Junior";
        String s2 = "Luana";

        boolean b = true;
        boolean b2 = false;

        long l = 1990L;
        long l2 = 1993L;

        byte by = 1;
        short sh = 33;

        System.out.println("i == i2 " + (i == i2));
        System.out.println("i != i2 " + (i != i2));
        System.out.println("b == b2 " + (b == b2));
        System.out.println("l == l2 " + (l == l2));
        System.out.println("f == f2 " + (f == f2));
        System.out.println("sh == by e sh > d " + ((sh == by) && (sh > d)));
        System.out.println("s == s2 " + (s == s2));
        System.out.println("c != c2 " + (c != c2));
    }
}
