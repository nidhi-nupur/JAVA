public class MergeSortLL {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to merge two sorted linked lists
    static Node sortedMerge(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        Node result;
        if (a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    // Function to find the middle of the linked list
    static Node getMiddle(Node head) {
        if (head == null)
            return head;

        Node fastPtr = head.next;
        Node slowPtr = head;

        while (fastPtr != null) {
            fastPtr = fastPtr.next;
            if (fastPtr != null) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
        }
        return slowPtr;
    }

    // Merge sort function
    static Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    // Utility function to print the linked list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(5);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(2);

        System.out.println("Linked List before sorting:");
        printList(head);

        head = mergeSort(head);

        System.out.println("Linked List after sorting:");
        printList(head);
    }
}
