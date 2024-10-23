/**
 * QueueUsingLL
 */

// Optimize implementation of Queue.
// Microsoft Interview Question.


public class QueueUsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class to implement queue operations using linked list
    static class Queue {
        static Node head = null; // Head of the queue (front)
        static Node tail = null; // Tail of the queue (rear)

        // isEmpty() Method - checks if the queue is empty
        public static boolean isEmpty() {
            return head == null && tail == null; // Returns true if both head and tail are null
        }

        // Add() Method - adds an element to the queue // TC = O(1)
        public static void add(int data) {
            Node newNode = new Node(data); // Create a new node with given data

            if(head == null) { // If the queue is empty
                head = tail = newNode; // Both head and tail point to the new node
                return;
            }
            tail.next = newNode; // Link the new node at the end of the queue
            tail = newNode; // Update the tail to the new node
        }

        // Remove() Method - removes an element from the front of the queue - TC = O(1)
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.data; // Get the data of the front element

            // If there's only one element in the queue
            if(tail == head) {
                tail = head = null;  // Both head and tail are set to null
            } else {
                head = head.next; // Move the head to the next node
            }
            return front; // Return the data of the removed element
        }

        // peek() Method - returns the front element without removing it - TC = O(1)
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return head.data; // Return the data at the front
        }

    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3); 

        // Remove and print elements from the queue until it's empty
        while(!queue.isEmpty()) {
            System.out.println(queue.peek()); // Print the front element
            queue.remove(); // Remove the front element
        }
    }
}