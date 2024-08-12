// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class SortingArrayLists {
    public static void sortArrayList(ArrayList<Integer> list) {
        System.out.println("The unsorted ArrayList is: " + list);
        // System.out.println("The sorted ArrayList is: " + Collections.sort(list)); // Error!!!
        // The error occurs because Collections.sort(list) returns void, meaning it doesn’t return a value that can be concatenated with the string in System.out.println. The Collections.sort(list) method sorts the list in place and doesn’t produce a new sorted list.
        Collections.sort(list);
        System.out.println("The sorted ArrayList is: " + list); // ArrayList sorted in Ascending Order.

        Collections.sort(list, Collections.reverseOrder()); // .reverseOrder() is a type of COMPARATOR that defines logic in the code.
        System.out.println("ArrayList sorted in decreasing order: " + list); // ArrayList sorted in Decreasing Order.

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(0);
        list.add(2);
        sortArrayList(list);
    }
}
