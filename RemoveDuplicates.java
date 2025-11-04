import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Temporary array to store unique elements
        int[] temp = new int[n];
        int uniqueCount = 0;

        // Loop through each element and check for duplicates
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] already exists in temp[]
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to temp[]
            if (!isDuplicate) {
                temp[uniqueCount++] = arr[i];
            }
        }

        // Display unique elements
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}
