public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        // Step1 = Create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step2 - newNode next = head
        newNode.next = head; // Link

        // step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++; 
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // Add in the middle.
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < index - 1) {
            temp = temp.next;
            i++;
        }

        // i = index - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

// remove 1st node.
    public int removeFirst() {
        if(size == 0) { // Means LL is empty.
            System.out.println("LinkedList is empty.");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // Head == tail == null
            int value = head.data;
            head = tail = null;
            size = 0;
            return value; 
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();

        ll.add(3, 24);
        ll.print();
        ll.add(0, 12);
        ll.print();

        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
    }
}
