import java.util.Scanner;
public class SumOfPrimesInRange {
    public static void main(String[] args) {
        System.out.print("Enter the range (two integers): ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                sum += num;
            }

        }
        System.out.println("Sum of primes in range: " + sum);
        sc.close();
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
