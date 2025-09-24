import java.util.Scanner;

public class ActivityOfTheDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        // Switch statement
        switch (day) {
            case 1:
                System.out.println("Math Class");
                break;
            case 2:
                System.out.println("Science Class");
                break;
            case 3:
                System.out.println("English Class");
                break;
            case 4:
                System.out.println("Sports");
                break;
            case 5:
                System.out.println("Art & Craft");
                break;
            case 6:
                System.out.println("Field Trip");
                break;
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid day number! Please enter between 1 and 7.");
        }

        sc.close();
    }
}
