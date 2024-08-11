import java.util.ArrayList;

public class ArrayListsSize {
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
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
