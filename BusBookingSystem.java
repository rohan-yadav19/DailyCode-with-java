import java.util.Scanner;

public class BusBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats in the bus: ");
        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        // Seats array
        String[] seats = new String[N];
        for (int i = 0; i < N; i++) {
            seats[i] = "Empty";
        }

        int choice;
        do {
            // Menu
            System.out.println("\n--- Bus Seat Booking System ---");
            System.out.println("1. View all seats");
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel a booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // View seats
                    System.out.println("\nSeat Status:");
                    for (int i = 0; i < N; i++) {
                        System.out.println("Seat " + (i + 1) + ": " + seats[i]);
                    }
                    break;

                case 2: // Book seat
                    System.out.print("Enter seat number to book (1-" + N + "): ");
                    int seatNo = sc.nextInt();
                    sc.nextLine(); // consume newline

                    if (seatNo < 1 || seatNo > N) {
                        System.out.println("Invalid seat number!");
                    } else if (!seats[seatNo - 1].equals("Empty")) {
                        System.out.println("Seat already booked!");
                    } else {
                        System.out.print("Enter passenger name: ");
                        String name = sc.nextLine();
                        seats[seatNo - 1] = name;
                        System.out.println("Seat " + seatNo + " booked for " + name);
                    }
                    break;

                case 3: // Cancel booking
                    System.out.print("Enter seat number to cancel (1-" + N + "): ");
                    int cancelSeat = sc.nextInt();
                    sc.nextLine(); // consume newline

                    if (cancelSeat < 1 || cancelSeat > N) {
                        System.out.println("Invalid seat number!");
                    } else if (seats[cancelSeat - 1].equals("Empty")) {
                        System.out.println("Seat is already empty!");
                    } else {
                        System.out.println("Booking cancelled for " + seats[cancelSeat - 1]);
                        seats[cancelSeat - 1] = "Empty";
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
