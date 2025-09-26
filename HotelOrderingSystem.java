import java.util.Scanner;

public class HotelOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display Menu
        System.out.println("===== Hotel Restaurant Menu =====");
        System.out.println("1. Starters (₹150 each)");
        System.out.println("2. Main Course (₹300 each)");
        System.out.println("3. Desserts (₹100 each)");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        int price = 0;

        // Switch case for menu selection
        switch (choice) {
            case 1:
                price = 150;
                System.out.println("You selected Starters.");
                break;
            case 2:
                price = 300;
                System.out.println("You selected Main Course.");
                break;
            case 3:
                price = 100;
                System.out.println("You selected Desserts.");
                break;
            default:
                System.out.println("Invalid Choice");
                sc.close();
                return; // Exit program if invalid choice
        }

        // Quantity input
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        int totalBill = price * qty;

        // Final bill
        System.out.println("Your total bill = ₹" + totalBill);

        sc.close();
    }
}
