public class SelectionSortIncrease {
    public static void SelectionSort(int arr[]) {
        for(int currentPosition=0; currentPosition <= arr.length-1; currentPosition++) { // Counts the currentPositions.
            int minPosition = currentPosition; // MinimumPosition = CurrentPosition
            for(int j = currentPosition+1; j<=arr.length-1; j++) {
                if(arr[minPosition] > arr[j]) { // (>)- Increasing Order.
                    minPosition = j;
                }
            }
            // Swap
            int temp = arr[minPosition];
            arr[minPosition] = arr[currentPosition];
            arr[currentPosition] = temp; // Swap currentPostion to minPosition.
        }
    }
    // Print Array 
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        SelectionSort(arr);
        printArr(arr);
    }
}
