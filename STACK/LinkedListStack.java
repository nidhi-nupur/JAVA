public class LinkedListStack {

    // Creating a Node class for LL implementation.
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Creating a stack using LL
    static class StackLinkedLists {
        static Node head = null; // Creating a LL with 0 elements.

        // To create Stack, four functions are needed: isEmpty() [to ensure id stack is empty or not.], push() [Add the element on the top of the stack], pop() [Delete the element from the top of the stack] and peek() [Detect the top elements].

        // *****isEmpty function
        public static boolean isEmpty() {
            return head == null; // Ensures the LL is empty.
            // return true if stack is empty or if the stack is not empty then the other functions will run.
        }

        // *****push function - add the data to the top of the memory stack.
        public static void push(int data) {
            Node newNode = new Node(data); // Creating the newNode in the memory.

            if (isEmpty()) {
                head = newNode; // If the LL is empty, assign the newNode as the Head of the LL.
                return;
            }

            newNode.next = head; // Storing the head value to the newNode.
            head = newNode; 
        }

        // *****pop function - Delete the data from the memory.
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data; // Assigning the orignal head data as the top element;
            head = head.next;
            return top;
        }

        // *****peek function - detect the top data.
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        StackLinkedLists stack = new StackLinkedLists();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
            // Output will be the head of the LL.
        }
    }
}
 