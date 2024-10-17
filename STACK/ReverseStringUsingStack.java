// DSA Question - AMAZON, FlipKart, Adobe, Microsoft, Paytm.
// Question 2 : Reverse a String using Stack.

import java.util.Stack;

public class ReverseStringUsingStack {

    public static void reverseString1(String string) {
        Stack<Character> stack = new Stack<>();

        int index = 0;

        while(index < string.length()) {
            stack.push(string.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder(""); // to store the results in the StringBuilder from the stack.
        while(!stack.isEmpty()) {
            char current = stack.pop(); // deleting the char of the string from the stack.
            result.append(current); // adding the char of the string from the stack to the StringBuilder [result].
        }
        string = result.toString(); // Assigning the resultant string to the String from the StringBuilder.

    }


    public static String reverseString2(String string) {
        Stack<Character> stack = new Stack<>();

        int index = 0;

        while(index < string.length()) {
            stack.push(string.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder(""); // to store the results in the StringBuilder from the stack.
        while(!stack.isEmpty()) {
            char current = stack.pop(); // deleting the char of the string from the stack.
            result.append(current); // adding the char of the string from the stack to the StringBuilder [result].
        }
        return result.toString(); // Assigning the resultant string to the String from the StringBuilder.

    }
    public static void main(String[] args) {
        String string = "abc";
        String result2 = reverseString2(string);
        System.out.println(result2);
       // String str2 = "lmn";
       // String result1 = reverseString1(str2);
       // System.out.println(result1);

    }
}
