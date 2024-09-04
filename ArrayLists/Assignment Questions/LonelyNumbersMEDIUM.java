// TC = O(n logn)
// SC = O(1)

/* import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 */
import java.util.*;

public class LonelyNumbersMEDIUM {
    public static List<Integer> findLonelyNumbers(ArrayList<Integer> nums) {
        List<Integer> lonelyNumbers = new ArrayList<>();

        // Step 1: Sort the list
        Collections.sort(nums);

        // Step 2: Identify lonely numbers
        for (int i = 0; i < nums.size(); i++) {
            boolean isLonely = true;

            // Check the previous number (if exists)
            if (i > 0 && nums.get(i) - nums.get(i - 1) <= 1) {
                isLonely = false;
            }

            // Check the next number (if exists)
            if (i < nums.size() - 1 && nums.get(i + 1) - nums.get(i) <= 1) {
                isLonely = false;
            }

            // If the number is lonely, add it to the result list
            if (isLonely) {
                lonelyNumbers.add(nums.get(i));
            }
        }

        return lonelyNumbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        /* nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8); */
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(3);
        nums.add(1);
        /* nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8); */

        List<Integer> lonelyNumbers = findLonelyNumbers(nums);
        System.out.println(lonelyNumbers); // Output e.g., [10, 8] or [8, 10].
    }
}
