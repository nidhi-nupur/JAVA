import java.util.Scanner;

public class ArraySorted {

    // For sorted array in ascending order.
    public static boolean isSorted(int arr[], int i) {
        // Base Case
        if(i == arr.length - 1) {
            return true;
        }

        // Check the 1st and 2nd elements are sorted or not
        if(arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursive case - checking if the other elements of tha array is sorted or not.
        return isSorted(arr, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The Size of the array:");
        int arrSize = sc.nextInt();

        int arr[] = new int[arrSize];
        System.out.print("The elements of the array:");
        for(int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        /* System.out.println("The array is: ");
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        } */

        System.out.println(isSorted(arr, 0)); // arrSize = 0 means Comparision starts from 0th index.

        
        System.out.println(isSorted(arr, 3)); // arrSize = 0 means Comparision starts from 0th index.
        // If the entered array is sorted -- true(output)
        // If the entered array is NOT sorted -- false(output)
    }
}