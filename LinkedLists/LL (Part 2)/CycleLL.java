class ListNode {
    int value;
    ListNode next;
    ListNode(int x) {
        value = x;
        next = null;
    }
}
public class CycleLL {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if(fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Detect Cycle
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        // Find the start of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode ll = new ListNode(1);
        ll.next = new ListNode(2);
        ll.next.next = new ListNode(4);
        ll.next.next.next = new ListNode(5);
        ll.next.next.next.next = new ListNode(6);
        ll.next.next.next.next.next = new ListNode(7);
        ll.next.next.next.next.next.next = new ListNode(8);
        ll.next.next.next.next.next.next.next = new ListNode(5);

        CycleLL cycleLL = new CycleLL();
        boolean hasCycle = cycleLL.hasCycle(ll);
        System.out.println("Has cycle: " + hasCycle);

        ListNode cycleStart = cycleLL.detectCycle(ll);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.value);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
