import java.util.Stack;

// Easy way to performs code of Stack.
// Java collection frameWork make it so easy to create stack cause all the four function are already exists in the java.util.Stack Java Package.
public class CollectionFrameworkStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
