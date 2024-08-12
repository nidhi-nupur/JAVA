import java.util.ArrayList;

public class ImplementationArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("First element: " + list.get(0));

        // Removing an element
        list.remove("Banana");

        // Iterating over the ArrayList
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
// Internally, ArrayList uses an array to store its elements. When the array
// becomes full, a new, larger array is created, and the elements are copied
// over. This allows the ArrayList to grow dynamically
