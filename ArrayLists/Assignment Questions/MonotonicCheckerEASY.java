import java.util.ArrayList;

public class MonotonicCheckerEASY {

    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean increasing = true;
        boolean decreasing = true;


        // Optimized code 
        // TC = O(n)
        // This approach is more efficient because it avoids unnecessary comparisons.
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                increasing = false;
            } else if (nums.get(i) > nums.get(i - 1)) {
                decreasing = false;
            }
        }

/* 
        // less optimized solution
        // TC = O(n^2) 
        // Compare all pairs of elements in the ArrayList.
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) < nums.get(j)) {
                    increasing = false;
                } else if (nums.get(i) > nums.get(j)) {
                    decreasing = false;
                }
            }
        } */
        return increasing || decreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
/* 
        // [1, 2, 2, 3]
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
 */
        
        // [6, 5, 4, 4]
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(4);

/* 
        // [1, 3, 2]
        nums.add(1);
        nums.add(3);
        nums.add(2);
 */
        System.out.println("Is the ArrayList monotonic? " + isMonotonic(nums));
    }
}
