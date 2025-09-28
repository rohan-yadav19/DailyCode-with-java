public class CountEvenOdd {
    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 21, 30, 45, 50, 67};

        int evenCount = 0;
        int oddCount = 0;

        // Loop through the array
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print results
        System.out.println("Count of Even Numbers: " + evenCount);
        System.out.println("Count of Odd Numbers: " + oddCount);
    }
}
