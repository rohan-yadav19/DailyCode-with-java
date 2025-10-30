import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        int evenCount = 0;
        int oddCount = 0;
        long temp=number;
        while(temp>0){
            long digit=temp%10;
            if(digit%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
            temp=temp/10;
        }
        System.out.println("Number: " + number);
        System.out.println("Count of even digits: " + evenCount);
        System.out.println("Count of odd digits: " + oddCount);
        scanner.close();
    }
}
