import java.util.Scanner;

public class ShipCostCalculator {
    void main() {
        Scanner in = new Scanner(System.in);
        double shipCost = 0;
        double totalCost = 0;
        double itemPrice = 0;
        final double SHIP_COST_THRESHOLD = 100;
        final double SHIP_RATE = .02;
        String trash = "";

        IO.print("Enter item cost: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            IO.println("You said your item cost was: \"" + trash + "\"");
            IO.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        if (itemPrice >= SHIP_COST_THRESHOLD) {
            totalCost = itemPrice;
        } else {
            shipCost = itemPrice * SHIP_RATE;
            totalCost = itemPrice + shipCost;
        }

        IO.print("The total cost of your item is $" + totalCost + " with a shipping price of $" + shipCost);
    }
}
