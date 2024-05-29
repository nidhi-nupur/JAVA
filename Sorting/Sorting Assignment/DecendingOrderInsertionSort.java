public class DecendingOrderInsertionSort {
    public static void insertionSortDecreasingOrder(int arr[]) {
        for(int i=1; i<=arr.length-1; i++) {
            int currElt = arr[i]; // Temperory elt.
            int prevElt = i - 1;
            // Finding out the position to insert.
            while(prevElt>=0 && arr[prevElt] < currElt) { // (<) - Decending Order
                arr[prevElt + 1] = arr[prevElt];
                prevElt--;
            }
            // Insert elt to currect position.
            arr[prevElt+1] = currElt;
        }
    }
    public static void printArr(int arr[]) {
        for(int i = 0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        insertionSortDecreasingOrder(arr);
        printArr(arr);
    }
}
