// DSA HARD Level Question - Microsoft, Paytm, Facebook
// Optimize Method - Using Stacks
// Time Complexity = O(n)

import java.util.Stack;

public class MaxAreaInHistogram {

    // Function to calculate the maximum area in a histogram
    public static void maxArea(int array[]) {
        int maxArea = 0; // Variable to store the maximum area
        int nextSmallerRight[] = new int[array.length]; // Array to store indices of the next smaller elements to the right
        int nextSmallerLeft[] = new int[array.length]; // Array to store indices of the next smaller elements to the left


/* 
        // Code of NextGreaterElementOnRIGHT
        Stack<Integer> stack = new Stack<>();

        for(int i = array.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && array[stack.peek()] <= array[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                // -1
            } else {
                // top
            }
            stack.push(i);
        }
 */



        // Next Smaller Right
        Stack<Integer> stack = new Stack<>(); // Creating a stack to store indices

        for(int i = array.length - 1; i >= 0; i--) { // Traverse from right to left
            while(!stack.isEmpty() && array[stack.peek()] >= array[i]) { // Pop elements that are greater than or equal to the current element
                stack.pop();
            }
            if(stack.isEmpty()) {
                nextSmallerRight[i] = array.length; // If stack is empty, no smaller element to the right
            } else {
                nextSmallerRight[i] = stack.peek(); // Top of the stack is the next smaller element's index
            }
            stack.push(i); // Push the current index onto the stack
        }


        // Next Smaller Left
        stack = new Stack<>(); // Emptying the stack.

        for(int i = 0; i <array.length; i++) { // Traverse from left to right
            while(!stack.isEmpty() && array[stack.peek()] >= array[i]) { // Pop elements that are greater than or equal to the current element
                stack.pop();
            }
            if(stack.isEmpty()) {
                nextSmallerLeft[i] = -1; // If stack is empty, no smaller element to the left
            } else {
                nextSmallerLeft[i] = stack.peek(); // Top of the stack is the next smaller element's index
            }
            stack.push(i); // Push the current index onto the stack
        }


        // Calculate the maximum area
        // Current Area: width = nextSmallerRight[i] - nextSmallerLeft[i] - 1
        for(int i = 0; i < array.length; i++) {
            int height = array[i]; // Height of the current histogram bar
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1; // Width of the rectangle
            int currentArea = height * width; // Calculate the area of the rectangle
            maxArea = Math.max(maxArea, currentArea); // Update the maximum area
        }

        // Print the maximum area in the histogram
        System.out.println("Maximum area in histogram = " + maxArea);
    }
    public static void main(String[] args) {
        int array[] = {2, 1, 5, 6, 2, 3}; // heights in histogram
        maxArea(array);
    }
}
