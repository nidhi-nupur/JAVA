import java.util.LinkedList;

public class LLAdd1stLast {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    // Function to Add Node to the beginning.
    public void addFirst(int data) {
        // Step1 = Create newNode
        Node newNode = new Node(data);

        // Base Case.
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step2 = newNode next = head
        newNode.next = head; // Link

        // Step3 = head = newNode
        head = newNode; 
    }

    // Function to Add Node to the Last.
    public void addLast(int data) {
        // Step1 = Create newNode
        Node newNode = new Node(data);

        // Base Case.
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2 = tail next = hnewNode
        tail.next = newNode; // Link

        // Step3 = tail = newNode
        tail = newNode; 
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3); // TC = O(1)

        ll.addLast(5);
        ll.addLast(6); // TC = O(1)
    }
}
