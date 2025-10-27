import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // Split words using one or more spaces
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
    }

        // Print final result
        System.out.println("Reversed Words String: " + result.toString().trim());
        sc.close();
    }
}

