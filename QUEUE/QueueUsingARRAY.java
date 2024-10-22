/**
 * QueueUsingARRAY
 */
public class QueueUsingARRAY {

    // A static inner class for Queue
    static class Queue {
        // Declaring static variables for the array, size, and rear
        static int array[];
        static int size;
        static int rear;

        // Queue Constructor initializes the array with given size and sets rear to -1 
        Queue(int n) {
            array = new int[n];
            size = n;
            rear = -1;
        }
 
        // isEmpty() Method - checks if the queue is empty by checking if rear is -1
        public static boolean isEmpty() {
            return rear == -1;
        }

        // Add Method - adds an element to the queue if it's not full
        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is Full");
                return; // Exit if full
            }
            rear++; // Increment rear to the next position
            array[rear] = data; // Add the new element at the rear
        }

        // Remove Method - removes an element from the front of the queue
        public static int remove() {
            if(isEmpty()) { // Check if the queue is empty
                System.out.println("Empty Queue");
                return -1; // Exit if empty
            }

            int front = array[0]; // Store the front element
            for(int i = 0; i < rear; i++) { // Shift all elements to the left
                array[i] = array[i + 1];
            }
            rear--;
            return front; // Return the removed front element
        }

        // peek Method - returns the front element without removing it
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return array[0]; // Return the front element
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create a new Queue with a capacity of 5
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        // 1 2 3 4 5

        // Remove and print elements from the queue until it's empty
        while (!queue.isEmpty()) {
            System.out.println(queue.peek()); // Print the front element
            queue.remove(); // Remove the front element
        }
    }
}