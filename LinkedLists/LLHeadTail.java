public class LLHeadTail {

    class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    
    // LinkedLists defined as a Class
    public class LinkedList {
        Node head;
        Node tail;
    
        public LinkedList() {
            this.head = null;
            this.tail = null;
        }
    
        public void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                // If the list is empty, set both head and tail to the new node
                head = newNode;
                tail = newNode;
            } else {
                // Otherwise, update the tail node's reference
                tail.next = newNode;
                tail = newNode;
            }
        }
    
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            LinkedList myList = new LinkedList();
            myList.addNode(10);
            myList.addNode(20);
            myList.addNode(30);
    
            System.out.println("LinkedList elements: ");
            myList.printList();
        }
    }
}