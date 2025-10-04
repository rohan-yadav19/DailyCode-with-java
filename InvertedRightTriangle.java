import java.util.Scanner;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Outer loop for rows
        for (int i = rows; i >= 1; i--) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        sc.close();
    }
}
