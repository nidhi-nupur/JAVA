class ListNode {
    int value;
    ListNode next;
    ListNode(int x) {
        value = x;
        next = null;
    }
}


public class RemoveCycleLL {
    public static boolean hasCycle() {
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
    public static void deleteCycle() {
        // Detect Cycle
        ListNode slow = head;
        ListNode fast = head;
        boolean cycleExists = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycleExists = true;
                break;
        }
        }
        if(cycleExists == false) {
            return;
        }


        // Find Meeting Point
        slow = head;
        ListNode previous = null;
        while(slow != fast) {
            previous = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null
        previous.next = null;
    }

    public static ListNode head;
    public static ListNode tail;
    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;

        System.out.println(hasCycle());
        deleteCycle();
        System.out.println(hasCycle());

    }
}
