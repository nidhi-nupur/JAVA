import java.util.ArrayList;

public class PairSum1_BruteForce {
// This method checks if there are any two numbers in the list that add up to the target value.
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        // Iterate through each element in the list
        for (int i = 0; i < list.size(); i++) {
            // For each element, iterate through the elements that come after it
            for (int j = i + 1; j< list.size(); j++) {
                // Check if the sum of the two elements equals the target value
                if (list.get(i) + list.get(j) == target) {
                    return true; // Return true if a pair is found
                }
            }
        }
        return false; // Return false if no such pair is found
    }
    public static void main(String[] args) {
        // Create an ArrayList and add some elements to it
        ArrayList<Integer> list = new ArrayList<>();
        // Create an ArrayList and add some elements to it
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum1(list, target)); // Expected output: true (1+4, 2+3)
        System.out.println(pairSum1(list, 23)); // Expected output: false
        System.out.println(pairSum1(list, 6)); // Expected output: true (1+5, 2+4)
        System.out.println(pairSum1(list, 9)); // Expected output: true (3+6, 4+5)
    } 
}
