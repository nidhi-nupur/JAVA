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

    // remove Last node.
    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        // Last Index == size - 1;
        // 2nd Last == prev == size -2;
        Node prev = head;
        for(int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int value = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }


    public int iterativeSearch(int key) { // TC = O(n)
        Node temp = head;
        int index = 0;

        while(temp != null) { // Key found
            if(temp.data == key) {
                return index;
            }
            index++;
        }

        // Key is not in the linkedLists
        return -1;
    }

    public int helper(Node head, int key) { // TC = O(n)
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1) {
            return -1;
        }
        return index + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }



    public void reverseLL() { // TC = O(n)
        Node previous = null;
        Node current = tail = head;
        Node next;

        while(current != null) {
            next = current;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void deleteNthfromEndinLL(int n) { // Amazon, Adobe, Flipkart, Qualcomm
        // Calculate size of the ll
        int llSize = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            llSize++;
        }


        if(n == llSize) {
            head = head.next; // removeFirst operation
            return;
        }

        // llSize - n;
        int i = 1;
        int iToFind = llSize - n;
        Node previous = head;
        while (i < iToFind) {
            previous = previous.next;
            i++;
        }
        previous.next = previous.next.next;
        return; 
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

        ll.removeLast();
        ll.print();

        System.out.println(ll.size); 

        System.out.println("Size of the Linked List is: " +  ll.size); 
        System.out.println("Key found at index:" + ll.iterativeSearch(3));
        System.out.println("Key found at index:" + ll.iterativeSearch(10));

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));


        ll.reverseLL();
        ll.print();


        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.print();
        ll.deleteNthfromEndinLL(3);
        ll.print();
        
    }
}
