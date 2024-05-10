public class DSBinarySearchM1 {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        // Base Case: If the search space is empty, return -1(not found).
        if(high >= low) {
            // Calculate the middle index.
            int mid = low + (high - low) / 2;
            // If middle elements is the target, return its index.
            if(arr[mid] == target) {
                return mid;
            }
            // If the target is greater than the middle element, search the right half.
            else if(arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, high);
            }
            // otherwise, search the left half.
            else{
                return binarySearch(arr, target, low, mid - 1);
            }
        }
        // Element not found.
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9,};
        int target = 8;
        int result = binarySearch(arr, target, 0, arr.length -1);
        if(result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
