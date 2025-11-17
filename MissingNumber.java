import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int[] arr = new int[N - 1];
        System.out.println("Enter " + (N - 1) + " numbers:");

        int actualSum = 0;
        for (int i = 0; i < N - 1; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }

        int expectedSum = N * (N + 1) / 2;

        int missing = expectedSum - actualSum;

        System.out.println("Missing Number: " + missing);

        sc.close();
    }
}
