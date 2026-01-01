import java.util.Scanner;

public class PassengerIdentityCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        // Convert to lowercase and remove spaces
        String cleaned = name.toLowerCase().replace(" ", "");

        char result = '-';

        for (int i = 0; i < cleaned.length(); i++) {
            char ch = cleaned.charAt(i);
            int count = 0;

            for (int j = 0; j < cleaned.length(); j++) {
                if (cleaned.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                result = ch;
                break;
            }
        }

        System.out.println("Output : " + result);
    }
}
