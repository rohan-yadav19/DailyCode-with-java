import java.util.Scanner;

public class DeliveryDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of hours
        System.out.print("Enter number of hours: ");
        int N = sc.nextInt();

        int totalDistance = 0;
        int maxDistance = -1;
        int maxHour = 1;

        // Read distance for each hour
        for (int i = 1; i <= N; i++) {
            System.out.print("Enter distance for hour " + i + ": ");
            int distance = sc.nextInt();

            totalDistance += distance;

            if (distance > maxDistance) {
                maxDistance = distance;
                maxHour = i;
            }
        }

        // Output results
        System.out.println("Total Distance: " + totalDistance);
        System.out.println("Max Distance Hour: " + maxHour);

        sc.close();
    }
}
