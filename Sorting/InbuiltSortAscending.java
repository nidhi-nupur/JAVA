import java.util.Arrays;
public class InbuiltSortAscending {
    // Print Array 
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArr1(int arr1[]) {
        for(int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr);
        printArr(arr);
        int arr1[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr, 0, 3);
        printArr1(arr1);
    }
}
