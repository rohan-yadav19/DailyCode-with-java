import java.util.Scanner;

public class ProductOfRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter value of M: ");
        int M = sc.nextInt();

        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        if (M > N) {
            System.out.println("Invalid Range! M is greater than N.");
            System.out.println("Result = 1");
        } else {
            long product = 1; // Use long to handle larger results
            for (int i = M; i <= N; i++) {
                product *= i;
            }
            System.out.println("Product of numbers from " + M + " to " + N + " = " + product);
        }

        sc.close();
    }
}
