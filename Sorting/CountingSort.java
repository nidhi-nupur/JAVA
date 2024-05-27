public class CountingSort {
    public static void SortingCountingPositiveNumbers(int arr[]) {
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
        for(int i=0; i<numbersFrequencies.length; i++) {
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
        // int arr[] = {5, 4, 1, 3, 2};
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        SortingCountingPositiveNumbers(arr);
        printArr(arr);
    }
}
