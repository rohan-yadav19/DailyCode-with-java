import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();    
        System.out.println("Before Swap:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swapping strings using a temporary variable
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("After Swap:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}
