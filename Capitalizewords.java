import java.util.Scanner;

public class Capitalizewords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase first
        input = input.toLowerCase();

        // Split words using one or more spaces
        String[] words = input.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Convert first letter to uppercase, rest remain lowercase
                char firstChar = Character.toUpperCase(word.charAt(0));
                String remaining = word.substring(1);
                result.append(firstChar).append(remaining).append(" ");
            }
        }

        // Print final result
        System.out.println("Converted String: " + result.toString().trim());

        sc.close();
    }
}
