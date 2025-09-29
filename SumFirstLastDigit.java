import java.util.Scanner;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Last digit
        int lastDigit = n % 10;

        // First digit
        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Sum of first and last digit
        int sum = firstDigit + lastDigit;

        System.out.println("Sum of first and last digit: " + sum);

        sc.close();
    }
}
