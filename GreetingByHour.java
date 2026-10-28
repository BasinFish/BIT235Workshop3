import java.util.Scanner;

public class GreetingByHour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an hour (1 to 24): ");
        int hour = input.nextInt();

        if (hour < 1 || hour > 24) {
            System.out.println("Invalid hour.");
        } else if (hour < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }
        input.close();
    }
}
