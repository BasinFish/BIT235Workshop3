public class DollarsWithCents {
    public static void main(String[] args) {
        double amount = 23.99;

        System.out.println("Dollars with cents: " + amount);
        System.out.printf("As currency: $%.2f%n", amount);
    }
}
