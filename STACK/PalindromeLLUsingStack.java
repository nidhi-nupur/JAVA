// DSA EASY Level Question - Microsoft, Intuit
// Using Optimizeed method - Stack.
// Time Complexity = O(n)
// Space Complexity: O(n)

import java.util.*;

class ListNode {
    char val; // Variable to store the value of the node
    ListNode next; // Reference to the next node in the linked list
    ListNode(char x) {
        val = x; // Initialize the value of the node
        next = null; // Initialize the next reference to null
    }
}

public class PalindromeLLUsingStack {

    // Function to check if the linked list is a palindrome
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) { // If the list is empty or has only one node
            return true; // It is a palindrome
        }

        Stack<Character> stack = new Stack<>(); // Create a stack to store characters
        ListNode slow = head, fast = head; // Initialize slow and fast pointers

        // Push first half of the list into the stack
        while (fast != null && fast.next != null) { // Traverse the list with slow and fast pointers
            stack.push(slow.val); // Push the value of the slow pointer to the stack
            slow = slow.next; // Move the slow pointer one step forward
            fast = fast.next.next; // Move the fast pointer two steps forward
        }

        // If the list has an odd number of elements, skip the middle one
        if (fast != null) {
            slow = slow.next; // Move the slow pointer one step forward
        }

        // Compare the second half of the list with the stack
        while (slow != null) { // Traverse the second half of the list
            if (stack.pop() != slow.val) { // Pop from stack and compare with the current slow pointer value
                return false; // If values do not match, it is not a palindrome
            }
            slow = slow.next; // Move the slow pointer one step forward
        }
        return true; // If all values match, it is a palindrome
    }
    public static void main(String[] args) {
        PalindromeLLUsingStack pll = new PalindromeLLUsingStack();
        ListNode head = new ListNode('A');
        head.next = new ListNode('B');
        head.next.next = new ListNode('C');
        head.next.next.next = new ListNode('B');
        head.next.next.next.next = new ListNode('A');
        // The linked list is A -> B -> C -> B -> A

        System.out.println(pll.isPalindrome(head)); // Output: true
    }
}
