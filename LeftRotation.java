import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input rotation count
        System.out.print("Enter the number of positions to rotate (K): ");
        int k = sc.nextInt();

        // Handle if k > n
        k = k % n;

        // Perform left rotation
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }

        // Print rotated array
        System.out.println("Array after left rotation by " + k + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
