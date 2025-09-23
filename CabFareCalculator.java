import java.util.Scanner;

public class CabFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking distance as input
        System.out.print("Enter ride distance in km: ");
        int distance = sc.nextInt();

        int fare;

        if (distance <= 5) {
            fare = 100; // Flat rate
        } else if (distance <= 15) {
            fare = distance * 10; // ₹10 per km
        } else {
            fare = distance * 8; // ₹8 per km
        }

        System.out.println("Total Fare: ₹" + fare);

        sc.close();
    }
}
