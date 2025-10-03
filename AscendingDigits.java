import java.util.Scanner;

public class AscendingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        String numStr = sc.next();

        boolean isAscending = true;

        // Start from index 1, compare with previous digit
        for (int i = 1; i < numStr.length(); i++) {
            // Skip negative sign if present
            if (numStr.charAt(i) == '-') continue;

            if (numStr.charAt(i) < numStr.charAt(i - 1)) {
                isAscending = false;
                break;
            }
        }

        // Output
        if (isAscending) {
            System.out.println("Digits are in ascending order");
        } else {
            System.out.println("Digits are not in ascending order");
        }

        sc.close();
    }
}
