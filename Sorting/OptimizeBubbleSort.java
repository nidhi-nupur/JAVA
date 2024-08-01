public class OptimizeBubbleSort {
    public static void main(String[] args) {
        int arr[] = {8, 5, 7, 3, 0};
        System.out.println("Array before Sorting: ");
        printArray(arr);
        optimBubbleSorting(arr);
        System.out.println("Array after Sorting: ");
        printArray(arr);
        
    }

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void optimBubbleSorting(int arr[]) {
        Boolean swapped;
        for(int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                // Swapping Operation 
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
            if(swapped == false) {
                break;
            }
        }
    }
}