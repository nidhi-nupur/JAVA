/* Sort the Array of Strings in Alphabetical / Lexicographphically Order. */

import java.util.Arrays;

public class StringArraySortingEASYLevelDSAQuestion {
    public static void main(String[] args) {
        // Input Array of Strings.
        // String array[] = { "Nidhi", "Nupur", "Shini", "Tuvi" };
        String array[] = { "sun", "earth", "mars", "mercury" };

        mergeSort(array, 0, array.length - 1); // mergeSort(arrayName, fromWhere, toWhere);
        System.out.println(Arrays.toString(array)); // Convert an Array into String representation.
    }

    public static void mergeSort(String array[], int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2; // mid == Array's Partition index.

            mergeSort(array, si, mid); // Array divide into left Subarray. mergeSort(arrayName, fromWhere, toWhere);
            mergeSort(array, mid + 1, ei); // Array divide into Right Subarray. mergeSort(arrayName, fromWhere,
                                           // toWhere);

            mergeSubArrays(array, si, mid, ei); // Merge All the Smallest Subarrays.
        }

    }

    public static void mergeSubArrays(String array[], int si, int mid, int ei) {
        // Size of Left Subarray.
        int sizeLeft = mid - si + 1; // si = 0, so (+ 1) is to maintain number of elements.

        // Size of Right Subarray.
        int sizeRight = ei - mid;

        String tempLeft[] = new String[sizeLeft]; // Temperory Array to HOLD the elements of the Left Subarray.

        String tempRight[] = new String[sizeRight]; // Temperory Array to HOLD the elements of the Right Subarray.

        // Copying to Left SubArray.
        for (int i = 0; i < sizeLeft; ++i) { // Loop will run (from 0 to sizeLeft) in tempLeft.
            tempLeft[i] = array[si + i]; // Elements will be printed (from si to mid) from the Original Array to temp
                                         // array.
        }

        // Copying to Right SubArray.
        for (int j = 0; j < sizeRight; ++j) { // Loop will run (from 0 to sizeRight) in tempRight.
            tempRight[j] = array[mid + 1 + j]; // Elements will be printed (from mid+1 to ei) from the Original Array to
                                               // temp array.
        }

        // Merge the Temporary SubArray.

        int i = 0, j = 0; // Initial indexes of Right and Left SubArrays respectively.
        int k = si; // Initial index for the Merged Array.

        // Merging Process.
        while (i < sizeLeft && j < sizeRight) { // Continues as long as there are elements in both subArrays.
            if (tempLeft[i].compareTo(tempRight[j]) <= 0) { // Compares the two Strings lexicographically.
                array[k] = tempLeft[i];
                i++;
            } else {
                array[k] = tempRight[j];
                j++;
            }
            k++;
        }

        while (i < sizeLeft) {
            array[k] = tempLeft[i];
            i++;
            k++;
        }

        while (j < sizeRight) {
            array[k] = tempRight[j];
            j++;
            k++;
        }
    }
}
