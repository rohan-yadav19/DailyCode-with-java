public class EmployeeSearch {
    public static void main(String[] args) {
        // Employee list (unsorted)
        int[] employeeIDs = {101, 205, 309, 402, 150};

        // Target employee ID to search
        int targetID = 500;

        // Flag to check if found
        boolean found = false;

        // Linear search
        for (int i = 0; i < employeeIDs.length; i++) {
            if (employeeIDs[i] == targetID) {
                System.out.println("Employee ID " + targetID + " found at position " + i);
                found = true;
                break; // Exit once found
            }
        }

        // If not found
        if (!found) {
            System.out.println("Employee ID " + targetID + " not found");
        }
    }
}
