public class DecendingOrderSelectionSort {
    public static void SelectionSortDecreasingOrder(int arr[]) {
        for(int CurrPosition=0; CurrPosition<arr.length; CurrPosition++) { // Counting the current position
            int minimumPosition = CurrPosition;
            for(int j=CurrPosition+1; j<arr.length; j++) {
            if(arr[minimumPosition] < arr[j]) { // (<)- Decreasing Order.
            minimumPosition = j;
            }
            }
            //swap
            int temp = arr[CurrPosition];
            arr[CurrPosition] = arr[minimumPosition];
            arr[minimumPosition] = temp; // Swap currentPostion to minPosition.
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
        SelectionSortDecreasingOrder(arr);
        printArr(arr);
    }
}
