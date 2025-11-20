import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Input character to remove
        System.out.print("Enter the character to remove: ");
        char c = sc.next().charAt(0);

        StringBuilder result = new StringBuilder();

        // Build the new string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {  // Keep only characters not equal to c
                result.append(s.charAt(i));
            }
        }

        // Output
        System.out.println("Updated String: " + result.toString());

        sc.close();
    }
}
