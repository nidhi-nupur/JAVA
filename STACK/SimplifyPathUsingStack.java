// DSA MEDIUM Level Question - Google, Amazon, Microsoft, and Facebook (now Meta)

import java.util.Stack;

public class SimplifyPathUsingStack {
    // Method to simplify the given Unix-style file path
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String parts[] = path.split("/");

        for(int i = 0; i < parts.length; i++) {
            String part = parts[i];
            if(part.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                } 
            } else if(!part.equals(".") && !part.equals("")) {
                stack.push(part); // Add the part to the stack
            }
        }
        StringBuilder result = new StringBuilder(); // Create a StringBuilder to build the result path
        // Iterate through the stack to construct the simplified path
        for (int i = 0; i < stack.size(); i++) {
            result.append("/").append(stack.get(i)); // Append each part with a '/' separator
        }

        // Return the resulting path, or '/' if it's empty
        return result.length() > 0 ? result.toString() : "/";
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/")); // Expected Output: /c
        System.out.println(simplifyPath("/NidhiNupur/")); // Expected Output: /NidhiNupur
        System.out.println(simplifyPath("/a/..")); // Expected Output: /
    }
}
