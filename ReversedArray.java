import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read size of array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse array in place
        int start = 0;
        int end = n - 1;
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }

        // Print reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
