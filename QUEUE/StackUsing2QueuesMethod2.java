import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2QueuesMethod2 {
    static class Stack {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        // add() - TC = O(1)
        public void add(int data) {
            queue1.add(data);
        }

        // remove() - TC = O(n)
        public int remove() {
            if (queue1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
            int top = queue1.remove();
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return top;
        }
        
        // peek() - TC = O(1)
        public int peek() {
            if (queue1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return ((LinkedList<Integer>) queue1).peekLast();
        }

        // Check if the stack is empty - O(1)
        public boolean isEmpty() {
            return queue1.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println(stack.peek()); // Output: 3
        System.out.println(stack.remove()); // Output: 3
        System.out.println(stack.peek()); // Output: 2
        System.out.println(stack.remove()); // Output: 2
        System.out.println(stack.remove()); // Output: 1
        System.out.println(stack.remove()); // Output: Stack is empty, -1
    }
}
