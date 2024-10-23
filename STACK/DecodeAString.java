/**
 * DecodeAString
 */

// DSA MEDIUM Level Question - Google, Facebook(META), Amazon, Microsoft, Uber, Apple.
import java.util.*;

public class DecodeAString {

    // Method to decode the encoded string
    public static String decodeString(String str) {
        Stack<String> stack = new Stack<>(); // Stack to keep track of strings and numbers
        StringBuilder currentString = new StringBuilder(); // StringBuilder for the current string being processed
        int k = 0; // Variable to store the current number (repeat count)

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            if (Character.isDigit(ch)) { // If the character is a digit
                k = k * 10 + (ch - '0'); // Build the number (supports multiple digits)
            } else if (ch == '[') { // If the character is an opening bracket
                stack.push(currentString.toString()); // Push the current string onto the stack
                stack.push(String.valueOf(k)); // Push the current number onto the stack
                currentString = new StringBuilder(); // Reset the current string
                k = 0; // Reset the number
            } else if (ch == ']') { // If the character is a closing bracket
                int repeatTimes = Integer.parseInt(stack.pop()); // Pop the number of repetitions from the stack
                String decodedString = stack.pop() + currentString.toString().repeat(repeatTimes); // Pop the string from the stack and repeat the current string
                currentString = new StringBuilder(decodedString); // Update the current string with the decoded string
            } else { // If the character is a letter
                currentString.append(ch); // Append the character to the current string
            }
        }

        return currentString.toString(); // Return the fully decoded string
    }

    public static void main(String[] args) {
        System.out.println(decodeString("2[cv]")); // Output : cvcv
        System.out.println(decodeString("3[b2[v]]")); // Output : bvvbvvbvv
    }
}