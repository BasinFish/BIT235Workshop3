public class TypeComparison {
    public static void main(String[] args) {
        // a. short (16 bits) vs int (32 bits)
        System.out.println("a) short: " + Short.SIZE + " bits, "
                + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("   int:   " + Integer.SIZE + " bits, "
                + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        // b. Both char and short use 16 bits, but char is unsigned.
        System.out.println("b) char:  " + Character.SIZE + " bits, "
                + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("   short: " + Short.SIZE + " bits (signed)");

        // c. double uses 64 bits, float uses 32 bits.
        System.out.println("c) float:  " + Float.SIZE + " bits");
        System.out.println("   double: " + Double.SIZE + " bits");

        // d. Both use 32 bits, but represent different kinds of values.
        System.out.println("d) int:   " + Integer.SIZE + " bits (exact integers)");
        System.out.println("   float: " + Float.SIZE + " bits (floating-point values)");
    }
}
