import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        // Handle negative numbers by converting to positive
        n = Math.abs(n);

        int count;

        if (n == 0) {
            count = 1; // Zero has 1 digit
        } else {
            count = 0;
            while (n > 0) {
                count++;
                n /= 10;
            }
        }

        // Output
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
