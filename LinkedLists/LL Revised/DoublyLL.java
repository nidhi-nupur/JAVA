public class DoublyLL {

    private Node head;
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void display() {
        Node newNode = head;
        Node last = null;
        while (newNode != null) {
            System.out.print(newNode.val + " -> ");
            last = newNode;
            newNode = newNode.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse..");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("Doesn't Exist.");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }


    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node (int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(17);
        // 17 -> 9 -> 6 -> 5 -> 2

        list.insertLast(99);
        list.display();

        list.insert(9, 25);
        list.display();
    }
}
