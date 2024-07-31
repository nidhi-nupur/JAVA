/*                                                Inversion Count: in two arrays
                                                     leftElement > rightElements
                                                           arr[i] > arr[j] 
*/

// Optimize way: Using Merge Sort
// TC = nlogn
// SC = O(n)
public class DSAQuestionHARDlevelTwoArraysInputs2 {

    public static void main(String[] args) {

        // arrays to count inversions
        int arr[] = { 1, 20, 6, 4, 5 };
        // int arr[] = { 5, 3, 2, 4, 1 };
        System.out.println("Total number of inversions are: " + countInversions(arr));
    }

    // Method to count of inversions in the array
    public static int countInversions(int arr[]) {

        // Creating a temporary array to help with merge sort
        int temp[] = new int[arr.length];

        // Calling the mergeSortAndCount function and return the inversion count
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }

    public static int mergeSortAndCount(int arr[], int temp[], int si, int ei) {
        int mid;
        int invCount = 0;

        // If there are more than one elements
        if (si < ei) {
            mid = si + (ei - si) / 2; // Find the midpoint

            invCount = invCount + mergeSortAndCount(arr, temp, si, mid); // Recursively sort and count inversions in the
                                                                         // left half.
            invCount = invCount + mergeSortAndCount(arr, temp, mid + 1, ei); // Recursively sort and count inversions in
                                                                             // the right half.

            invCount = invCount + mergeAndCount(arr, temp, si, mid, ei); // Merge the two halves and count inversions
                                                                         // during the merge.
        }
        return invCount;
    }

    public static int mergeAndCount(int arr[], int temp[], int si, int mid, int ei) {
        int i = si; // Starting index for the left subarray.
        int j = mid + 1; // Starting index for the right subarray.
        int k = si; // Starting index to be sorted.

        int invCount = 0;

        // Merge the two subarrays.
        while (i <= mid && j <= ei) {
            // If the element in the left subarray is smaller or equal, no inversion.
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                // If the element in the right subarray is smaller, count inversions.
                temp[k++] = arr[j++];
                invCount += (mid + 1 - i); // Count Inversions.
            }
        }

        // Copy the remaining elements of Left Subarray if any.
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy the remaining elements of right Subarray if any.
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted Subarrays into the Original array.
        for (i = si; i <= ei; i++) {
            arr[i] = temp[i];
        }
        return invCount;
    }
}
