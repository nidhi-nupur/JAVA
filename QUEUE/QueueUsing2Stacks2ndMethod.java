import java.util.Stack;

public class QueueUsing2Stacks2ndMethod {
    static class Queue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Add (enqueue) operation - O(1)
        public void add(int data) {
            stack1.push(data);
        }

        // Remove (dequeue) operation - O(n) in the worst case, O(1) in average cases
        public int remove() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if(stack2.isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return stack2.pop();
        }

        // peek operation - O(n) in the worst case, O(1) average cases
        public int peek() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop()); 
                }
            }
            if (stack2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack2.peek();
        }

        // Check if the Queue is empty - O(1)
        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.peek()); // Output: 1
        System.out.println(queue.remove()); // Output: 1
        System.out.println(queue.peek()); // Output: 2
        System.out.println(queue.remove()); // Output: 2
        System.out.println(queue.remove()); // Output: 3
        System.out.println(queue.remove()); // Output: Queue is empty, -1
    }
}
