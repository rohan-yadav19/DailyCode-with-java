import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Unique Elements: ");

        // Print first element always
        if (n > 0) {
            System.out.print(arr[0] + " ");
        }

        // Compare each element with previous one
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
