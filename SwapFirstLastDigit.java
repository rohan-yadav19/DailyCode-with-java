import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        // Handle negative numbers
        boolean isNegative = n < 0;
        n = Math.abs(n);

        // If single digit → return the number itself
        if (n < 10) {
            System.out.println("Result: " + (isNegative ? -n : n));
            return;
        }

        // Find number of digits
        long digits = (long) Math.log10(n);
        long power = (long) Math.pow(10, digits);

        // Extract first and last digit
        long firstDigit = n / power;
        long lastDigit = n % 10;

        // Middle part of the number
        long middle = (n % power) / 10;

        // Construct new number with swapped digits
        long swapped = lastDigit * power + middle * 10 + firstDigit;

        // Add sign back if negative
        if (isNegative) swapped = -swapped;

        System.out.println("Result: " + swapped);

        sc.close();
    }
}
