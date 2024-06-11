import java.util.Scanner;

public class ShipCost {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of an item: ");
        double itemPrice = in.nextDouble();

        double shippingCost;
        double totalPrice;

        if (itemPrice >= 100) {
            System.out.println("Shipping is free!");
            totalPrice = itemPrice; // No additional shipping cost
        } else {
            shippingCost = 0.02 * itemPrice;
            System.out.println("The cost of shipping is: " + shippingCost);
            totalPrice = shippingCost + itemPrice;
        }

        System.out.println("The total price is: " + totalPrice);
        in.close();
    }
}