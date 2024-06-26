import java.util.Scanner;

public class LastOccurance {

    /* // Concise code (exact same but in Short.)
    public static int lastOccur(int arr[], int key, int i) {
        // Further inspection with other elements of the array ahead.
        if (i == arr.length) {
            return -1; // When key not found.
        }
        // Compare with self
        int isFound = lastOccur(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    } */

    public static int lastOccur(int arr[], int key, int i) {
        // Further inspection with other elements of the array ahead.
        if (i == arr.length) {
            return -1; // When key not found.
        }
        int isFound = lastOccur(arr, key, i + 1);
        if (isFound != -1) {
            return isFound;
        }
        // Compare with self
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        System.out.println("The Array elements: ");
        for(int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Key: ");
        int key = sc.nextInt();

        System.out.println("Key found at " + lastOccur(arr, key, 0) + " index.");
    }
}
