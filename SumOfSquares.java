import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int sum = 0;

        // Calculate sum of squares from M to N
        for (int i = M; i <= N; i++) {
            sum += i * i;
        }

        // Check conditions
        if (sum > N) {
            System.out.println(-1);
        } else {
            if (sum % 2 == 0) {
                System.out.println(sum / 2);
            } else {
                System.out.println(sum);
            }
        }

        sc.close();
    }
}
