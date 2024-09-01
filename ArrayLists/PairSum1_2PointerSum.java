import java.util.ArrayList;

public class PairSum1_2PointerSum {
    // Function to find if there exists a pair in the list that sums up to the target
    public static boolean PairSum(ArrayList<Integer> list, int target) {
        int leftPointer = 0; // Initialize leftPointer to the start of the list
        int rightPointer = list.size() - 1;  // Initialize rightPointer to the end of the list

        // Iterate while leftPointer does not meet rightPointer
        while (leftPointer != rightPointer) {
            // Case 1: If the sum of the elements at leftPointer and rightPointer equals the target, return true
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            }
            // Case 2: If the sum is less than the target, move the leftPointer one step to the right
            if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer++; 
            } else {
                // Case 3: If the sum is greater than the target, move the rightPointer one step to the left
                rightPointer--;
            }
        }
        return false; // If no such pair exists, return false
    }
    public static void main(String[] args) {
        // Create a list of integers
        ArrayList<Integer> list = new ArrayList<>();
        // Adding elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // Test the PairSum function with different target values
        System.out.println(PairSum(list, 5)); // Expected output: true (2 + 3)
        System.out.println(PairSum(list, 50)); // Expected output: false (No such pair)
        System.out.println(PairSum(list, 8)); // Expected output: true (2 + 6 or 3 + 5)
        System.out.println(PairSum(list, 1)); // Expected output: false (No such pair)
    }
}
