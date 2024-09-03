import java.util.ArrayList;

public class MostFrequentNumberEASY {
    public static int findMostFrequentTarget(ArrayList<Integer> nums, int key) {
        int maxCount = 0;
        int mostFrequentTarget = -1;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                int target = nums.get(i + 1);
                // Update the count for the target
                int count = 1; // Initialize with 1 (since occurrence is already found)
                while (i + 1 < nums.size() && nums.get(i + 1) == target) {
                    count++;
                    i++; // Move to the next element
                }
                // Check if this target has a higher count
                if (count > maxCount) {
                    maxCount = count;
                    mostFrequentTarget = target;
                }
            }
        }
        return mostFrequentTarget;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(2);
        nums.add(4);
        nums.add(2);
        int key = 2;
        System.out.println("Most Frequent target following " + key + ": " + findMostFrequentTarget(nums, key));
        System.out.println("Most Frequent target following " + key + ": " + findMostFrequentTarget(nums, 4));
    }
}
