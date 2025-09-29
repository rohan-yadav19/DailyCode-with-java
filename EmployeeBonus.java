import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: base salary
        System.out.print("Enter base salary: ");
        double baseSalary = sc.nextDouble();

        // Input: performance rating
        System.out.print("Enter performance rating (Excellent, Good, Average, Poor): ");
        String rating = sc.next();

        double adjustedSalary = baseSalary;
        int bonus = 0;

        // Conditions for salary adjustment
        if (rating.equalsIgnoreCase("Excellent")) {
            adjustedSalary = baseSalary + (baseSalary * 0.20);
            bonus = 10000;
        } else if (rating.equalsIgnoreCase("Good")) {
            adjustedSalary = baseSalary + (baseSalary * 0.10);
            bonus = 5000;
        } else if (rating.equalsIgnoreCase("Average")) {
            adjustedSalary = baseSalary + (baseSalary * 0.05);
            bonus = 2000;
        } else if (rating.equalsIgnoreCase("Poor")) {
            adjustedSalary = baseSalary; // No increase
            bonus = 0;
        } else {
            System.out.println("Invalid rating entered!");
            sc.close();
            return;
        }

        // Output
        System.out.println("Adjusted Salary: ₹" + adjustedSalary);
        System.out.println("Bonus: ₹" + bonus);

        sc.close();
    }
}
