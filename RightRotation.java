import java.util.Scanner;

public class RightRotation {
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

        // Perform right rotation
        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        // Print rotated array
        System.out.println("Array after right rotation by " + k + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
