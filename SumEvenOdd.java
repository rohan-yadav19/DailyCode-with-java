public class SumEvenOdd {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of even numbers from 1 to 100: " + evenSum);
        System.out.println("Sum of odd numbers from 1 to 100: " + oddSum);
    }
}
