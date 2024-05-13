// Using Collection.reverse() method.
import java.util.*;
public class ReverseArray4 {
    // Method to reverse an array using Collection.reverse()
    public static void reverse(Integer[] arr) {
        Collections.reverse(Array.asList(arr));
        // Reverse the list (which is essentially the array)
        System.out.println("Reversed array is: ");
        // Prints the reversed list.
        System.out.println(Array.asList(arr));
    }
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
}
