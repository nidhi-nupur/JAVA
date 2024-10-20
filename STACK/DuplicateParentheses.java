// DSA MEDIUM Level question - Microsoft, Google.
import java.util.Stack;

public class DuplicateParentheses {

    // Function to check if there are duplicate parentheses in the given string
    public static boolean isDuplicate(String str) { // Time Complexity = O(n)
        Stack<Character> stack = new Stack<>(); // Creating a stack to store characters

        // Loop through each character in the string
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at index i

            // First Method to pop the element.
            // If the character is a closing parenthesis
            if (ch == ')') { 
                int count = 0; // Initialize a counter to track characters within the parentheses

                // Pop elements from the stack until an opening parenthesis is found
                while( /* stack.isEmpty() && */ stack.peek() != '(' ) {  // Can remove [stack.isEmpty()] function because the string is Valid and if the string is valid that means Opening brackets [(] will already be present in the stack.  
                    stack.pop(); // Pop the top element from the stack
                    count++; // Increment the counter
                }

                // If the counter is less than 1, it means there were no elements within the parentheses
                if (count < 1) {
                    return true; // String has duplicate parentheses
                } else {
                    stack.pop(); // Pop the opening parenthesis from the stack
                }
            } else {
                // If the character is an opening parenthesis, operator, or operand, push it onto the stack
                stack.push(ch);
            }

/* 
            // Short Method to pop the element.
            // If the character is a closing parenthesis
            if (ch == ')') { 
                int count = 0; // Initialize a counter to track characters within the parentheses

                // Pop elements from the stack until an opening parenthesis is found
                while(stack.pop() != '(' ) {  
                    count++; // Increment the counter
                }

                // If the counter is less than 1, it means there were no elements within the parentheses
                if (count < 1) {
                    return true; // String has duplicate parentheses
                }
            } else {
                // If the character is an opening parenthesis, operator, or operand, push it onto the stack
                stack.push(ch);
            }
 */

        }
        return false; // Return false if no duplicate parentheses are found
    }
    public static void main(String[] args) {
        String str1 = "((a + b))"; // Example string with duplicate parentheses
        String str2 = "(a + b)"; // Example string without duplicate parentheses
        System.out.println(isDuplicate(str1)); // Output: true
        System.out.println(isDuplicate(str2)); // Output: false
    }

}
 
