import java.util.LinkedList;

class ListNode {
    int value;
    ListNode next;
    ListNode(int x) {
        value = x;
    }
}

public class PalindromeLinkedListOPTIMIZE { // TC = O(n)
// SC = O(1) Constant space complexity.
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step1: Find the middle of the LinkedList
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step2: Reverse the second half of the LinkedList
        ListNode previous = null;
        ListNode current = slow;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        // Step 3: Compare the first half and the reversed second half
        ListNode firstHalf = head;
        ListNode secondHalf = previous;
        while (secondHalf != null) {
            if (firstHalf.value != secondHalf.value) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        // Step 4: Restore the original LinkedList (optional)
        // (You can skip this step if you don't need to restore the list)
        // current = prev;
        // prev = null;
        // while (current != null) {
        //     ListNode nextNode = current.next;
        //     current.next = prev;
        //     prev = current;
        //     current = nextNode;
        // }
        
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

        PalindromeLinkedListOPTIMIZE pLL = new PalindromeLinkedListOPTIMIZE();
        System.out.println(pLL.isPalindrome(node1)); // true
    }
}
