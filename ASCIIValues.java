import java.util.Scanner;

public class ASCIIValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("ASCII values of characters in the string:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asciiValue = (int) ch;
            System.out.println("Character: '" + ch + "' ASCII Value: " + asciiValue);
        }
    }
    
}
