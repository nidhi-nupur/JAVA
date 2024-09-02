// Optimized way 
// TC = O(n^2)

import java.util.ArrayList;

public class PairSum2_2PointerApproach {

    // Function to find if there exists a pair with the given target sum in a sorted
    // and rotated list
    public static boolean PairSum2(ArrayList<Integer> list, int target) {
        // Find the pivot point in the list where the array is rotated
        int pivot = findPivot(list, 0, list.size() - 1);

        // Left pointer starts just after the pivot (smallest element in the array)
        int leftPointer = (pivot + 1) % list.size();

        // Right pointer starts at the pivot (largest element in the array)
        int rightPointer = pivot;

        // Loop until the two pointers meet
        while (leftPointer != rightPointer) {
            // Calculate the current sum of elements at the left and right pointers
            int currentSum = list.get(leftPointer) + list.get(rightPointer);

            // If the current sum matches the target, return true
            if (currentSum == target) {
                return true;
            }

            // If current sum is less than the target, move the left pointer to the right
            if (currentSum < target) {
                leftPointer = (leftPointer + 1) % list.size();
            } else { // If current sum is greater, move the right pointer to the left
                rightPointer = (list.size() + rightPointer - 1) % list.size();
            }
        }
        // If no pair with the given target sum is found, return false
        return false;
    }

    // Function to find the pivot point in the array
    public static int findPivot(ArrayList<Integer> list, int low, int high) {

        // Base case: if high is less than low, no pivot (array is not rotated)
        if (high < low) {
            return -1;
        }
        // If high equals low, this is the pivot point
        if (high == low) {
            return low;
        }

        // Find the middle index
        int mid = (low + high) / 2;

        // Check if mid is the pivot (the element is greater than the next one)
        if (mid < high && list.get(mid) > list.get(mid + 1)) {
            return mid;
        }
        // Check if mid-1 is the pivot (the previous element is greater than mid)
        if (mid > low && list.get(mid) < list.get(mid - 1)) {
            return mid - 1;
        }
        // Recursively search in the left half if the pivot is there
        if (list.get(low) >= list.get(mid)) {
            return findPivot(list, low, mid - 1);
        }
        // Otherwise, search in the right half
        return findPivot(list, mid + 1, high);
    }

    public static void main(String[] args) {
        // Example list (rotated and sorted array)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        if (PairSum2(list, 16)) {
            System.out.println("Pair with given target sum EXISTS.");
        } else {
            System.out.println("NO Pair with given target sum exists.");
        }
        if (PairSum2(list, 1)) {
            System.out.println("Pair with given target sum EXISTS.");
        } else {
            System.out.println("NO Pair with given target sum exists.");
        }
        if (PairSum2(list, 6)) {
            System.out.println("Pair with given target sum EXISTS.");
        } else {
            System.out.println("NO Pair with given target sum exists.");
        }
        if (PairSum2(list, 25)) {
            System.out.println("Pair with given target sum EXISTS.");
        } else {
            System.out.println("NO Pair with given target sum exists.");
        }
        if (PairSum2(list, 30)) {
            System.out.println("Pair with given target sum EXISTS.");
        } else {
            System.out.println("NO Pair with given target sum exists.");
        }
    }
}
