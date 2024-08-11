import java.util.ArrayList;

public class ReverseArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(1);
        System.out.println("Size of the ArrayLists is: " + list.size());

        // Print the ArrayLists
        System.out.println("The ArrayList is: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Print the reverse of the Arraylist
        System.out.println("The reverse of the ArrayList is: ");
        for (int i = list.size() - 1 ; i >= 0; i-- ) { // TC = O(n)
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
