import java.util.Arrays;
import java.util.Collections;

public class InbuiltSortDecending {
    // Print Array 
    public static void printArr(Integer arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArr1(Integer arr1[]) {
        for(int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
        Integer arr1[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArr1(arr1);
    }
}
