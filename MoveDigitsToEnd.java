import java.util.Scanner;

public class MoveDigitsToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        StringBuilder nonDigits = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        // Separate non-digits and digits
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                digits.append(ch);     // keep digits in order
            } else {
                nonDigits.append(ch);  // keep alphabets & symbols in order
            }
        }

        // Final result = non-digits + digits
        String result = nonDigits.toString() + digits.toString();
        System.out.println(result);

        sc.close();
    }
}
