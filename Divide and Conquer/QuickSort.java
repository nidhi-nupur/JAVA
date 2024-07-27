import java.util.Scanner;

public class QuickSort {

    public static void printArray(int array[]) {
        System.out.println("The sorted array by Quick Sorting method is");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void quickSorting(int array[], int si, int ei) {
        // Taking last element as PIVOT.

        // Base Case
        if(si >= ei) {
            return; // When the si and ei are equal, the array is already sorted cause it is single element array.
        }

        /* Partition Function: Partitioning the array into two Sub-arrays:-
        - One with the elements less than the pivot and
        - one with the elements greater than the pivot.
        */
        int pivotIndex = partition(array, si, ei);

        // To place the pivot element on its correct position - recursive call.
        quickSorting(array, si, pivotIndex - 1); // Sorting Left Part Sub-array.
        quickSorting(array, pivotIndex + 1, ei); // Sorting Right Part Sub-array.
    }

    public static int partition(int array[], int si, int ei) {
        // Taking last element as PIVOT.
        int pivot = array[ei];
        int i = si - 1; // Iterator - makes place for elements smaller than pivot.

        for(int j = si; j < ei; j++) {
            if(array[j] <= pivot) {
                i++;
                // Swaping the elements
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        // To place the pivot element on its correct position.
        i++;
        int temp = pivot;
        array[ei] = array[i];
        array[i]= temp;
        return i;

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The size of the array is:");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        System.out.println("Enter " + arraySize + " elements of the array: ");
        for(int i = 0; i < arraySize; i ++) {
            array[i] = sc.nextInt();
        }
        quickSorting(array, 0, array.length - 1);
        printArray(array);
    }
}
