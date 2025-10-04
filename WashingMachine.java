import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of clothes (in grams): ");
        
        // Check if input is an integer
        if (!sc.hasNextInt()) {
            System.out.println("INVALID INPUT");
            return;
        }

        int weight = sc.nextInt();

        if (weight < 0) {
            System.out.println("INVALID INPUT");
        } else if (weight == 0) {
            System.out.println("Time Estimated: 0 minutes");
        } else if (weight >= 1 && weight <= 2000) {
            System.out.println("Time Estimated: 25 minutes");
        } else if (weight >= 2001 && weight <= 4000) {
            System.out.println("Time Estimated: 35 minutes");
        } else if (weight >= 4001 && weight <= 7000) {
            System.out.println("Time Estimated: 45 minutes");
        } else {
            System.out.println("OVERLOADED");
        }
    }
}
