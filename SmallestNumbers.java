import java.util.Scanner;

public class SmallestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int smallest = Math.min(a, Math.min(b, c));
        System.out.print("Smallest number(s): ");
        if (a == smallest) {
            System.out.print(a + " ");
        }
        if (b == smallest) {
            System.out.print(b + " ");
        }
        if (c == smallest) {
            System.out.print(c + " ");
        }
        System.out.println();
        input.close();
    }
}
