import java.util.Stack;

public class ValidParentheses {

    // Function to check if the parentheses in the given string are valid
    public static boolean isValid(String str) { // TC = O(n)
        Stack<Character> stack = new Stack<>(); // Creating a stack to store opening brackets

        // Loop through each character in the string
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at index i


            // If the character is an opening bracket, push it onto the stack
            if(ch == '(' || ch == '{' || ch == '[') { // Opening Brackets
                stack.push(ch);
            } else { // If the character is a closing bracket
                // Closing 
                if(stack.isEmpty()) { // Check if the stack is empty (no matching opening bracket)
                    return false; // Return false if no matching opening bracket
                }

                // Check if the top of the stack matches the corresponding opening bracket
                if( (stack.peek() == '(' && ch == ')') // Matching pair ()
                   || (stack.peek() == '{' && ch == '}') // Matching pair {}
                   || (stack.peek() == '[' && ch == ']') ) { // Matching pair []
                    stack.pop(); // Pop the matching opening bracket from the stack
                } else {
                    return false; // Return false if the brackets don't match
                }
            }
        }

        // If the stack is empty, all opening brackets have been matched
        if(stack.isEmpty()) {
            return true; // Return true if valid
        } else {
            return false; // Return false if there are unmatched opening brackets
        }
    }
    public static void main(String[] args) {
        // String str = "({[]})[()]{}"; // Example string to check
        String str = "("; // Example string to check
        System.out.println("When the String is " + str + " :");
        System.out.println(isValid(str));
    }
}
