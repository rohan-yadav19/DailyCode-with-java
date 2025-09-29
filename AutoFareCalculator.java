import java.util.Scanner;

public class AutoFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance
        System.out.print("Enter the distance travelled (in km): ");
        int distance = sc.nextInt();

        int fare;

        // Conditions for fare calculation
        if (distance <= 2) {
            fare = 30;
        } else if (distance <= 5) {
            fare = 50;
        } else if (distance <= 10) {
            fare = 80;
        } else {
            fare = 100 + (distance - 10) * 10;
        }

        // Output the fare
        System.out.println("Total Auto Fare = ₹" + fare);

        sc.close();
    }
}
