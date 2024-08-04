import java.util.Scanner;

public class Array {

    // Function to change Array values.
    public static void changeArrayValues(int arr[], int i, int value) {
        // Base Case
        if (i == arr.length) { // If the index i is equal to the length of the array, the base case is reached.
            System.out.println("Array in Base Case: ");
            printArray(arr); // Call the printArray method to print the array.
            return;
        }

        // Rucursive Work
        arr[i] = value; // Set the current array element to the given value i.e, 1.
        changeArrayValues(arr, i + 1, value + 1); // Recursively call the method with the next index and incremented
                                                  // value.
        arr[i] = arr[i] - 2; // Backtracking Step // After the recursive call, decrement the current array
                             // element by 2.
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        changeArrayValues(array, 0, 1); // Call the changeArrayValues method to modify the array with 1st elt as
                                                // 1.
        System.out.println("Array in main function: ");
        printArray(array);
    }

}
