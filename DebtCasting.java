public class DebtCasting {
    public static void main(String[] args) {
        // Example value from the Word document (26 Oct 2026).
        // This is a fixed exercise value, not a live debt figure.
        long nationalDebt = 40_528_359_000_000L;
        int debtAsInt = (int) nationalDebt;
        double debtAsDouble = (double) nationalDebt;
        byte debtAsByte = (byte) debtAsDouble;

        System.out.println("Debt (long): " + nationalDebt);
        System.out.println("Debt (int): " + debtAsInt);
        System.out.println("Debt (double): " + debtAsDouble);
        System.out.println("Debt (byte): " + debtAsByte);
    }
}
