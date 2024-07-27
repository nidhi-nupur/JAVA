import java.util.Scanner;

// The SC and TC of this algorithm is O(log n), where ( n ) is the number of elements in the array.
// Using Recursion.
public class DSAMediumLvlQuestion {

    // Recursive function to search for the target in the array.
    public static int search(int arr[], int target, int si, int ei) {

        // Base case: If the start index exceeds the end index, the target is not found.
        if (si > ei) {
            return -1;
        }

        // Calculate the middle index.
        int mid = si + (ei - si) / 2;

        // Case: When the middle value is the target value.
        if (arr[mid] == target) {
            return mid;
        }

        // mid on Line 1:
        // Check if the middle element is in the first sorted half.
        if (arr[si] <= arr[mid]) {

            // Case a: Left of Line 1, Target is in the left half.
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // Case b: Right(till ei) of arr[mid], Target is in the right half.
                return search(arr, target, mid + 1, ei);
            }
        }

        // mid on Line 2:
        // Check if the middle element is in the second sorted half.
        else {

            // Case c: Right of Line 2, Target is in the right half.
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // Case d: Left(till si) of arr[mid], Target is in the left half.
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Target: ");
        int target = sc.nextInt();

        // Call the search function and print the result.
        int targetIndex = search(arr, target, 0, arr.length - 1);
        System.out.println(targetIndex);
    }
}
