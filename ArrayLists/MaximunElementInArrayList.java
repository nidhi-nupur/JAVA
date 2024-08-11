import java.util.ArrayList;

public class MaximunElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(0);
        list.add(3);
        list.add(1);
        System.out.println(list);

        // Print Maximum element, TC = O(n)
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            /* if (max < list.get(i)) {
                max = list.get(i);
            } */

            /* OR */

            max = Math.max(max, list.get(i));  // This Function Compares "max" and "list.get(i)".
        }
        System.out.println("The Maximum element is: " + max);
    }
}
