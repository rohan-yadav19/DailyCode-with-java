import java.util.Scanner;

public class SupermarketDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of items
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int totalBill = 0;

        // Input: item prices
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            int price = sc.nextInt();

            if (price >= 500) {
                totalBill += price - (price * 20 / 100); // 20% discount
            } else if (price >= 200) {
                totalBill += price - (price * 10 / 100); // 10% discount
            } else {
                totalBill += price; // No discount
            }
        }

        // Output: total bill
        System.out.println("Total Bill after discount = " + totalBill);

        sc.close();
    }
}
