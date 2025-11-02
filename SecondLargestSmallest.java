import java.util.Scanner;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Check if array has at least 2 elements
        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize variables
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        // One-pass traversal
        for (int num : arr) {
            // Find largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        
        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("Second largest element does not exist.");
        else
            System.out.println("Second largest element: " + secondLargest);

        if (secondSmallest == Integer.MAX_VALUE)
            System.out.println("Second smallest element does not exist.");
        else
            System.out.println("Second smallest element: " + secondSmallest);

        sc.close();
    }
}
