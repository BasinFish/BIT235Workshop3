public class PerfectSquares {
    public static void main(String[] args) {
        System.out.print("4B - Perfect squares: ");

        for (int i = 1; i <= 100; i++) {
            int root = (int) Math.sqrt(i);
            if (root * root == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
