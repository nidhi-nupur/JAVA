// VVI Question - Logic IMPORTANT.

/* 
Types of Questions same as this :
- Next Greater on Right.
- Next Greater on Left.
- Next Smaller on Right.
- Next Smaller on Left.
 */
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int array[] = {6, 8, 0, 1, 3}; // Initializing an array with elements
        Stack<Integer> stack = new Stack<>(); // Creating a stack to keep track of elements' indices
        int nxtGreater[] = new int[array.length]; // Array to store the next greater elements

        // Time complexity = O(n)
        for(int i = array.length - 1; i >= 0; i--) { // Looping from the end of the array to the beginning
            // while loop - to pop elements from the stack that are less than or equal to the current element
            while(!stack.isEmpty() && array[stack.peek()] <= array[i]) {
                stack.pop(); // Remove the top element from the stack
            }

            // if-else - to determine the next greater element for the current element
            if(stack.isEmpty()) { // If the stack is empty, no greater element to the right
                nxtGreater[i] = -1; // Assign -1 if no greater element is found
            } else { // Otherwise, the element at the top of the stack is the next greater element
                nxtGreater[i] = array[stack.peek()];
            }

            // push the current element's index onto the stack
            stack.push(i);
        }

        // Loop to print out the elements in the nxtGreater array
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " "); // Print the next greater element for each position
        }
        System.out.println();

    }
}
