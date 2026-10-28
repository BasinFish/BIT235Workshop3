import java.util.Scanner;

public class NumberToCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (0 to 35): ");
        int number = input.nextInt();

        if (number < 0 || number > 35) {
            System.out.println("Invalid number.");
        } else if (number <= 9) {
            System.out.println(number);
        } else {
            char letter = (char) ('A' + number - 10);
            System.out.println(letter);
        }
        input.close();
    }
}
