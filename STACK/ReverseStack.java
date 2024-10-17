import java.util.*;

// DSA Question
// Question 2 : Reverse a Stack.
public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop(); // removing the top element of the Stack
        pushAtBottom(stack, data); 
        stack.push(top);
    }

    // Method to reverse the stack
    public static void ReverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }

        int top = stack.pop(); // removing the top element of the Stack
        ReverseStack(stack); // recursive call to remove the 2nd top element after the 1st top get removed.
        pushAtBottom(stack, top); // pushing at bottom to get reversed Stack.
    }

    // Method to print the Stack
    public static void printStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1); 
        stack.push(2);
        stack.push(3);
/*          // Stack will be as:
               _
               3
               2
               1 
*/
/* 
        - 1st element to be pop out : 3
        - 2nd element to be pop out : 2
        - 3rd element to be pop out : 1
  */       
        // System.out.println("Stack before reversed: ");
        // printStack(stack); // 3, 2, 1
        System.out.println("Stack after reversed: ");
        ReverseStack(stack); 
/*         // After reversing, the stack will be as:
               _
               1
               2
               3
 */
/* 
        - 1st element to be pop out : 1
        - 2nd element to be pop out : 2
        - 3rd element to be pop out : 3
  */      
        printStack(stack); // 1, 2, 3
    }
}
