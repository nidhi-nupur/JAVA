import java.util.*;

// TC = O(1) - for all three operations[add, remove, peek]
public class QueueUsingJCF {
    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
