import java.util.ArrayList;

public class ArrayListStack {

    // Creating a stack using ArrayLists
    static class StackArrayLists {
        static ArrayList<Integer> list = new ArrayList<>();

        // To create Stack, four functions are needed: isEmpty() [to ensure id stack is empty or not.], push() [Add the element on the top of the stack], pop() [Delete the element from the top of the stack] and peek() [Detect the top elements].

        // *****isEmpty function
        public static boolean isEmpty() {
            return list.size() == 0; // return true if stack is empty or if the stack is not empty then the other functions will run.
        }

        // *****push function - add the data to the top of the memory stack.
        public static void push(int data) {
            list.add(data); // Data will be stored at the top most of the stack or at the last index of the list.
        }

        // *****pop function - Delete the data from the memory.
        // So first we store the data to return to the memory then delete it.
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1); // Storing the data that is going to delete.
            list.remove(list.size() - 1); // Deleting the top data.
            return top; // Returning the deleted data.
        }

        // *****peek function - detect the top data.
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Creating a new Stack in the memory.
        // Format: _stackClassName stackName = new _stackClassName();
        // Example: Stack s = new Stack();

        StackArrayLists stack = new StackArrayLists();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
            // Output will follow LIFO [Last In First Out] Pattern.
        }
    }
}