import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not rotations of each other");
        } else {
            // Concatenate first string with itself
            String combined = str1 + str1;

            // Check if second string is a substring of the combined string
            if (combined.contains(str2)) {
                System.out.println("Strings are rotations of each other");
            } else {
                System.out.println("Strings are not rotations of each other");
            }
        }

        sc.close();
    }
}
