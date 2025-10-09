import java.util.Scanner;

public class AscendingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Convert number to string for easy digit comparison
        String str = String.valueOf(num);

        boolean isAscending = true;

        // Compare each digit with the next one
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                isAscending = false;
                break;
            }
        }

        // Output result
        if (isAscending)
            System.out.println("Digits are in ascending order");
        else
            System.out.println("Digits are not in ascending order");

        sc.close();
    }
}
