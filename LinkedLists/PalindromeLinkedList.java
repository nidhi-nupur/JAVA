import java.util.ArrayList;

class ListNode {
    int value;
    ListNode next;
    ListNode(int x) {
        value = x;
    }
}

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>(); // TC = O(n) SC = O(n)

        // Step 1: Traverse the LinkedList and store values
        ListNode current = head;
        while (current != null) {
            values.add(current.value);
            current = current.next;
        }

        // Step 2: Check if the ArrayList is a Palindrome
        int start = 0;
        int end = values.size() - 1;
        while (start < end) {
            if (values.get(start) != values.get(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        PalindromeLinkedList pLL = new PalindromeLinkedList();
        System.out.println(pLL.isPalindrome(node1)); // true
    }
}
