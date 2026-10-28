public class SumOfSquares {
    public static void main(String[] args) {
        int sumOfSquares = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
        }
        System.out.println("4A - Sum of squares: " + sumOfSquares);
    }
}
