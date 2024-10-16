import java.util.*;

// DSA Question - AMAZON
// Question 1 : Push at the BOTTOM of the Stack.
public class PushAtBottomStack {
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()) {
            stack.push(data); // Add 4 at the bottom. // when the stack become empty, we push the data to the bottom of the Stack.
            return;
        }

        int top = stack.pop(); // removing and storing the top elements of the stack after every recursive call. // 1st removes 3, then 2 then 1, and when the stack become empty, we push the data to the bottom of the Stack.
        pushAtBottom(stack, data); // By recursion, we push the data to the bottom of the Stack.
        stack.push(top); // When the data pushed at the bottom, we pushed the top on top of the data in the stack.
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack, 4);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
