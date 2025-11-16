import java.util.Scanner;

public class SecondSmallestLargestDistinct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Integer min1 = null, min2 = null;   // smallest, second smallest
        Integer max1 = null, max2 = null;   // largest, second largest

        for (int x : arr) {

            // ---------- FOR SMALLEST VALUES ----------
            if (min1 == null || x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x != min1 && (min2 == null || x < min2)) {
                min2 = x;
            }

            // ---------- FOR LARGEST VALUES ----------
            if (max1 == null || x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x != max1 && (max2 == null || x > max2)) {
                max2 = x;
            }
        }

        // ---------- OUTPUT ----------
        if (min2 == null || max2 == null) {
            System.out.println("Second smallest and second largest do not exist");
        } else {
            System.out.println("Second smallest: " + min2);
            System.out.println("Second largest: " + max2);
        }

        sc.close();
    }
}
