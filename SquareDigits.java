import java.util.Scanner;
public class SquareDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        String str=String.valueOf(Math.abs(n));
        String result="";
        for(int i=0;i<str.length();i++){
            int digit=str.charAt(i)-'0';
            int square=digit*digit;
            result+=square;
        }
        if(n<0){
            System.out.print("-"+result);
        }else{
            System.out.print(result);
        }
        sc.close(); 
    }
}
