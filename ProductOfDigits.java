import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Handle negative numbers
        n = Math.abs(n);

        // Special case: if number is 0 → product = 0
        if (n == 0) {
            System.out.println("Product of digits: 0");
            return;
        }

        int product = 1;

        // Multiply digits
        while (n > 0) {
            int digit = n % 10; // get last digit
            product *= digit;   // multiply
            n /= 10;            // remove last digit
        }

        // Output
        System.out.println("Product of digits: " + product);

        sc.close();
    }
}
