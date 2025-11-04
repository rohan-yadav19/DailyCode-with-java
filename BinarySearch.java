import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input sorted array elements
        System.out.println("Enter " + n + " elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input key to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Perform binary search
        int result = binarySearch(arr, 0, n - 1, key);

        // Display result
        if (result == -1)
            System.out.println("Element not found in the array.");
        else
            System.out.println("Element found at index: " + result);

        sc.close();
    }

    // Binary Search function (iterative)
    public static int binarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids overflow

            if (arr[mid] == key)
                return mid; // Element found

            if (arr[mid] < key)
                left = mid + 1; // Search right half
            else
                right = mid - 1; // Search left half
        }
        return -1; // Element not found
    }
}
