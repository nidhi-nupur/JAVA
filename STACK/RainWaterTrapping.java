// DSA MEDIUM LEVEL QUESTION.

// Google, Amazon, Microsoft, and Samsung.

// TC = O(n)
// sC = O(n)

import java.util.Stack;

public class RainWaterTrapping {
    // Method to calculate the amount of trapped water
    public static int trap(int[] height) {
        int n = height.length; // Get the length of the height array
        if (n == 0) return 0; // If the array is empty, no water can be trapped

        Stack<Integer> stack = new Stack<>(); // Create a stack to store the indices of the bars
        int waterTrapped = 0; // Variable to store the total amount of trapped water

        // Iterate through each bar in the height array
        for (int i = 0; i < n; i++) {
            // While the stack is not empty and the current bar height is greater than the height of the bar at the top of the stack
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) { 
                int top = stack.pop(); // Pop the top element from the stack

                // If the stack becomes empty after popping, break out of the loop
                if (stack.isEmpty()) break;

                int distance = i - stack.peek() - 1; // Calculate the horizontal distance between the current bar and the bar at the new top of the stack
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top]; // Calculate the bounded height of water that can be trapped
                waterTrapped += distance * boundedHeight; // Add the trapped water to the total
            }
            stack.push(i); // Push the current index onto the stack
        }

        return waterTrapped; // Return the total amount of trapped water
    }

    public static void main(String[] args) {
        int[] heights = {7, 0, 4, 2, 5, 0, 6, 4, 0, 6}; // Sample height array representing the elevation map
        System.out.println(trap(heights)); // Output the total amount of trapped water, which is 27
    }
}
