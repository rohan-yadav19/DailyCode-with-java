public class SmallLargeSum {
    
    public static int SmallLargeSum(int[] arr) {
        // Rule b & c: If array is empty or has 3 or fewer elements, return 0
        if (arr == null || arr.length <= 3) {
            return 0;
        }

        // Separate elements at even and odd indices
        int[] even = new int[arr.length / 2 + 1];
        int[] odd = new int[arr.length / 2 + 1];
        int e = 0, o = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even[e++] = arr[i];
            } else {
                odd[o++] = arr[i];
            }
        }

        // Find the second largest in even-indexed elements
        int secondEven = secondLargest(even, e);

        // Find the second largest in odd-indexed elements
        int secondOdd = secondLargest(odd, o);

        // Add both and return the result
        return secondEven + secondOdd;
    }

    // Helper function to find the second largest element
    private static int secondLargest(int[] arr, int n) {
        if (n < 2) return 0;
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        return second;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1, 7, 5, 4};
        System.out.println("Output: " + SmallLargeSum(arr1)); // Expected 7 (3+4)

        int[] arr2 = {1, 8, 0, 2, 3, 5, 6};
        System.out.println("Output: " + SmallLargeSum(arr2)); // Expected 8 (2+6)

        int[] arr3 = {1, 2, 3};
        System.out.println("Output: " + SmallLargeSum(arr3)); // Expected 0
    }
}
