import java.util.Scanner;
public class IncreasingDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        n=Math.abs(n);
        int prevDigit=10; // Initialize to a value greater than any digit
        boolean isIncreasing=true;
        while(n>0){
            int currentDigit=n%10;
            n=n/10;
            if(currentDigit>=prevDigit){
                isIncreasing=false;
                break;
            

    }
            prevDigit=currentDigit;
        }
        if(isIncreasing){
            System.out.println("The digits are in increasing order.");
        } else {
            System.out.println("The digits are not in increasing order.");
        }
        sc.close();
    }
}
