import java.util.Scanner;

public class PictureFrameCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Picture length (inches): ");
        double length = input.nextDouble();
        System.out.print("Picture width (inches): ");
        double width = input.nextDouble();
        input.nextLine(); // Consume the remaining newline.

        System.out.print("Frame type (regular/fancy): ");
        String type = input.nextLine().trim().toLowerCase();
        System.out.print("Frame colour: ");
        String colour = input.nextLine().trim();
        System.out.print("Number of corner crowns (0-4): ");
        int crowns = input.nextInt();

        if (length <= 0 || width <= 0 || crowns < 0 || crowns > 4
                || (!type.equals("regular") && !type.equals("fancy"))) {
            System.out.println("Invalid input.");
        } else {
            double perimeter = 2 * (length + width);
            double frameRate = type.equals("regular") ? 0.15 : 0.25;
            double frameCost = perimeter * frameRate;
            double colourCost = colour.equalsIgnoreCase("white")
                    ? 0 : perimeter * 0.10;
            double crownCost = crowns * 0.35;
            double total = frameCost + colourCost + crownCost;

            System.out.printf("Total framing cost: $%.2f%n", total);
        }
        input.close();
    }
}
