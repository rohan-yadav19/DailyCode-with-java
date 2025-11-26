import java.util.*;

public class PairWithDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k value: ");
        int k = sc.nextInt();

        if (pairExists(arr, k)) {
            System.out.println("Pair Found");
        } else {
            System.out.println("No Pair");
        }
    }

    // Function to check pair with difference k
    public static boolean pairExists(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            // Check if (num + k) or (num - k) exists
            if (set.contains(num + k) || set.contains(num - k)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
