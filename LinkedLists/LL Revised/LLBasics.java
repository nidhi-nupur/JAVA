public class LLBasics {

    private Node head;
    private Node tail;
    private int size;
    // Constructor: A constructor is like the welcoming committee for a class in the world of programming. When we create an object(which is just a fancy way of saying you make a new object)(an instance) from a class, the constructor is the first thing that gets called.
    // Its job? To set things up, allocate memory, and make sure everything is ready for the further need.
    public LLBasics() {
        this.size = 0;
    }

    // Inserting a new node to a Linked List.
    public void insertFirst(int val) {
        Node node = new Node(val); // created a new Node to insert.
        node.next = head; // Added the new node to the LL's head. (So there is two reference for the LL's 1st Node - newNode and LL's head)
        head = node; // changing the head position i.e. previous LL's head is now pointing to the newNode.

        if(tail == null) { // It means that the 1st item has been added.
            tail = head; 
        }
        size++; // Size of the LL increased by 1 as the new node is added.

    }

    public void insertLast(int val) {

        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val); // created a new Node to insert.
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for(int j = 0; j < index; j++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node seconfLast = get(size - 2);
        int val = tail.value;
        tail = seconfLast;
        tail.next = null;
        return val;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;
        // Constructor
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }



    public static void main(String[] args) {
        LLBasics list = new LLBasics(); // Initialized things: head, tail, size.
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(17);
        // 17 -> 9 -> 6 -> 5 -> 2
        list.insertLast(99);
        list.insert(55, 4);
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}