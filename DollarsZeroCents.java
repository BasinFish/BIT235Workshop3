public class DollarsZeroCents {
    public static void main(String[] args) {
        double wholeDollar = 23.00;

        System.out.println("Dollars with zero cents: " + wholeDollar);
        System.out.printf("As currency: $%.2f%n", wholeDollar);
    }
}
