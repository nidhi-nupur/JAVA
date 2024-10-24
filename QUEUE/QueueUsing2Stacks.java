// DSA IAQ - Microsoft, Google
//

import java.util.*;

public class QueueUsing2Stacks {
    static class Queue {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();

        public static boolean isEmpty() {
            return stack1.isEmpty();
        }

        // add() 
        public static void add(int data) { // TC = O(n)
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            stack1.push(data);

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }   
        }

        // remove
        public static int remove() { // TC = O(1)
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return stack1.pop();
        }

        // peek
        public static int peek() { // TC = O(1)
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return stack1.peek();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
