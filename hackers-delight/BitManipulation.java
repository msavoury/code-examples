/*
 * Examples of fiddling with bits
 */
public class BitManipulation {

    public static void main(String... args) {
        if (args.length == 0) {
            gracefulExit("Must provide a numeric value as an argument");
        }
        int x;// = 0;
        try {
            x = Integer.parseInt(args[0]);
            manipulateBits(x);
        }
        catch (NumberFormatException nfe) {
            gracefulExit("Unable to parse input");
        }
    }

    public static void manipulateBits(int n) {
        System.out.println(n + " as binary: " + Integer.toBinaryString(n));

        int removeRightmost1 = n & (n - 1);
        System.out.println("Remove rightmost bit: (n & (n-1) ): " + Integer.toBinaryString(removeRightmost1));

    }

    public static void gracefulExit(String s) {
        System.out.println(s);
        System.exit(1);
    }

}
