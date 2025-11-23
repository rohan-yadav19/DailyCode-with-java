import java.util.Scanner;

public class OneCharDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Condition 1: Length must be same
        if (s1.length() != s2.length()) {
            System.out.println("NO");
            return;
        }

        int diffCount = 0;

        // Count positions where characters differ
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
            }
        }

        // Condition: exactly one difference
        if (diffCount == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
