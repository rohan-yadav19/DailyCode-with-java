import java.util.Scanner;

public class CheckIfLinkedListSorted {

    // Node class for singly linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to check whether the linked list is sorted
    static boolean isSorted(Node head) {
        if (head == null || head.next == null)
            return true; // empty or single node list is sorted

        Node current = head;
        while (current.next != null) {
            if (current.data > current.next.data) {
                return false; // found a descending pair
            }
            current = current.next;
        }
        return true;
    }

    // Function to create linked list from user input
    static Node createLinkedList(Scanner sc, int n) {
        if (n <= 0) return null;

        System.out.print("Enter element 1: ");
        Node head = new Node(sc.nextInt());
        Node current = head;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            current.next = new Node(sc.nextInt());
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes in the linked list: ");
        int n = sc.nextInt();

        Node head = createLinkedList(sc, n);

        if (isSorted(head))
            System.out.println("The linked list is sorted.");
        else
            System.out.println("The linked list is not sorted.");

        sc.close();
    }
}
