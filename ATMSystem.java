import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000; // Example balance
        System.out.print("Enter withdrawal amount: ");
        int withdrawal = sc.nextInt();

        if (withdrawal <= balance) {
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Insufficient Balance");
        }

        sc.close();
    }
}
