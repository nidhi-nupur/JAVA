public class DecendingOrderCountingSort {
    public static void SortingCountingPositiveNumbersDecreasingOrder(int arr[]) {
        int range = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            range = Math.max(range, arr[i]);
        }
        int numbersFrequencies[] = new int[range+1]; // range + 1 = Additional 0th index

        // Iteration on original array (arr[]).
        for(int i=0; i<arr.length; i++) { // numbersFrequencies array is for positive numbers/elements.
            numbersFrequencies[arr[i]]++; // arr[i] = numbers/elements = indexes for numbersFrequencies array.
        }
        // Sorting
        int j = 0; // Original array's index is initialize by 0.
        // Iteration on numbersFrequencies[].
        for(int i=numbersFrequencies.length-1 ; i>=0 ; i--) {
            while(numbersFrequencies[i]>0) {
                arr[j] = i; // Elements update. 
                j++;
                numbersFrequencies[i]--; // For more than one frequencies, frequencies(elements of) in numbersFrequencies[] array will decrease by one until it become 0.
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        SortingCountingPositiveNumbersDecreasingOrder(arr);
        printArr(arr);
    }
}
