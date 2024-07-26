import java.util.Scanner;

public class MergeSort {

// Depth first Merge Sort
    // TC = O(nlogn)
    // SC = O(n) --> Size of temperory array.
    public static void printArray(int array[]) {
        System.out.println("The Sorted array is: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSorting(int array[], int si, int ei) {
        // Base Case:
        if(si >= ei) {
            return; // When the si and ei are equal, the array is already sorted cause it is single element array.
        }
        // Main work:
        // Dividing the array:
        int mid = si + (ei - si)/2; // This method Avoids Integer overflow. // Other way: (si + ei)/2.

        // Sorting the divided part of the array.
        mergeSorting(array, si, mid); // Left part
        mergeSorting(array, mid + 1, ei); // Right part

        // Merging the sorted part of the divided array.
        merge(array, si, mid, ei); // Calling the function having temperory array.
    }

    public static void merge(int array[], int si, int mid, int ei) {
        // left(0, 3)=4 elts   right(4, 6)=3 elts 
        // --> 6(ei) - 0(si) + 1 == 7 elts
        int temp[] = new int[ei - si + 1]; // Let the size is 5, means si = 0 & ei = 4, [ei(4) - si(0) = 4(size)] but the size is 5, that is why [ei(4) - si(0) + 1 = 5(size)].
        int i = si; // iterator for left part.
        int j = mid + 1; // iterator for right part.
        int k = 0; // iterator for temperory array.

        // Copying all elements from the 1st part of the divided part of the original array.
        while(i <= mid && j <= ei) {
            if(array[i] < array[j]) {
                temp[k] = array[i];
                i++;
                k++;
            } else {
                temp[k] = array[j];
                j++;
                k++;
            }
        }
        // OR
        /*
        while(i <= mid && j <= ei) {
            if(array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        */

        // For copying all elements from the 2nd part of the divided part of the original array.
        // Left Part
        while(i <= mid) {
            temp[k++] = array[i++];
        }
        // Right part
        while(j <= ei) {
            temp[k++] = array[j++];
        }


        // Copying temporary array to original array.
        for(k=0, i=si; k<temp.length; k++, i++) {
            array[i] = temp[k]; // Copying all elements from temp array to original array.
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements of the array: ");
        for(int i = 0; i <= size; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSorting(arr, 0, arr.length-1);
        printArray(arr);
    }
}
