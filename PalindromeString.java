import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase and remove spaces for uniform comparison
        str = str.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome)
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");

        sc.close();
    }
}
