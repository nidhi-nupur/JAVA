public class DecendingOrderBubbleSort {
    public static void BubbleSortingDecendingOrder(int arr[]) {
        for(int shift = 0; shift <arr.length-1; shift++) {
            for(int j=0; j<arr.length-2-shift; j++) { // overviewing the elements of the array.
                if(arr[j] < arr[j+1]) { // Checking greatest element, then shifting it to the last index by swapping.
                    // Swapping larger elements to the smaller one.
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void PrintArray(int arr[]) {
        for(int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        BubbleSortingDecendingOrder(arr);
        PrintArray(arr);
    }
}
