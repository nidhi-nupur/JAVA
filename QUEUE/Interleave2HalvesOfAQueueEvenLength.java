import java.util.LinkedList;
import java.util.Queue;

public class Interleave2HalvesOfAQueueEvenLength {

    public static void interLeave(Queue<Integer> queue) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = queue.size();

        for(int i = 0; i < size/2; i++) {
            firstHalf.add(queue.remove());
        }
        
        while(!firstHalf.isEmpty()) {
            queue.add(firstHalf.remove());
            queue.add(queue.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        interLeave(queue);
        // Print Queue
        while(!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}
