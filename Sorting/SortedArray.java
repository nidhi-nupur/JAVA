public class SortedArray {
    public static void ArrayBubbleSort(int arr[]) {
        for(int turn=0; turn<arr.length - 1; turn++) {
            int swap = 0;
            for(int j=0; j<arr.length-1-turn; j++) { // j <= arr.length - 2 - turn;
                if(arr[j] > arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            System.out.println("Swap = " + swap + " times");
        }
    }
    public static void printArr(int arr[]) {
        System.out.println("Sorted Array = ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        ArrayBubbleSort(arr);
        printArr(arr);
    }
}
