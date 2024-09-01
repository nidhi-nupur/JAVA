// TC = O(n^2)

import java.util.ArrayList;

public class PairSum2_BruteForce {
    // Function to check if there exists a pair with the given target sum
    public static boolean PairSum2 (ArrayList<Integer> list, int target) {
        // Check each pair in the array
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                // If a pair with the target sum is found
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        // If no such pair is found
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        if (PairSum2(list, 16)) {
            System.out.println("Pair with given target sum exists.");
        } else {
            System.out.println("No Pair with given target sum exists.");
        }
        if (PairSum2(list, 1)) {
            System.out.println("Pair with given target sum exists.");
        } else {
            System.out.println("No Pair with given target sum exists.");
        }
        if (PairSum2(list, 30)) {
            System.out.println("Pair with given target sum exists.");
        } else {
            System.out.println("No Pair with given target sum exists.");
        }
        if (PairSum2(list, 7)) {
            System.out.println("Pair with given target sum exists.");
        } else {
            System.out.println("No Pair with given target sum exists.");
        }
    }
}
