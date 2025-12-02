import java.util.*;

public class MaxProductOfTwo {

    public static long maxProduct(int[] arr) {
        int n = arr.length;
        if (n < 2) return 0;  // Not enough elements

        // Track largest and second largest
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        // Track smallest and second smallest (for handling negatives)
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : arr) {

            // Update largest values
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // Update smallest values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        long prod1 = (long) max1 * max2; // product of two largest
        long prod2 = (long) min1 * min2; // product of two smallest (negatives)

        return Math.max(prod1, prod2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long result = maxProduct(arr);
        System.out.println("Maximum Product: " + result);
    }
}
