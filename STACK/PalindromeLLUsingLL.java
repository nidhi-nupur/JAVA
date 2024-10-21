// DSA EASY Level Question - Microsoft, Intuit
// Using Linked List Method
// Time Complexity = O(n)
// Space Complexity: O(n)

class ListNode {
    char val;  // Value of the node
    ListNode next; // Reference to the next node
    ListNode(char x) {
        val = x; // Initialize the value
        next = null; // Initialize the next reference
    }
}


public class PalindromeLLUsingLL {

    // Function to check if the linked list is a palindrome
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) { // If list is empty or has only one element
            return true; // It is a palindrome
        }

        // Find the Middle of the List - Using Slow-Fast Pointer.
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) { // Loop to move slow by 1 step and fast by 2 steps
            slow = slow.next; // Move slow pointer by one step
            fast = fast.next.next; // Move fast pointer by two steps
        }

        // Reverse the 2nd half
        ListNode prevNode = null, currentNode = slow;

        while (currentNode != null) { // Loop to reverse the list from the middle to the end
            ListNode nextTemp = currentNode.next; // Temporarily store the next node
            currentNode.next = prevNode; // Reverse the current node's pointer
            prevNode = currentNode; // Move prevNode one step ahead
            currentNode = nextTemp; // Move to the next node
        }

        // Compare both halves
        ListNode firstHalf = head, secondHalf = prevNode;

        while (secondHalf != null) { // Loop until the end of the second half
            if (firstHalf.val != secondHalf.val) { // Compare values of the nodes
                return false; // If not equal, it is not a palindrome
            }
            firstHalf = firstHalf.next; // Move the first half pointer to the next node
            secondHalf = secondHalf.next; // Move the second half pointer to the next node
        }

        return true; // If all values matched, it is a palindrome

    }
    public static void main(String[] args) {
        PalindromeLLUsingLL pll = new PalindromeLLUsingLL();
        ListNode head = new ListNode('A');
        head.next = new ListNode('B');
        head.next.next = new ListNode('C');
        head.next.next.next = new ListNode('B');
        head.next.next.next.next = new ListNode('A');
        // A -> B -> C -> B -> A

        System.out.println(pll.isPalindrome(head)); // Output: true
    }
}
