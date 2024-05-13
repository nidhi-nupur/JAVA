// Using a temporary array.
public class ReverseArray2 {
    public static void reverse(int[] arr, int n) {
        int[] reverseArray = new int[n];
        int j = n;
        for(int i = 0; i < n; i++) {
            reverseArray[j - 1] = arr[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: ");
        for(int k = 0; k < n; k++) {
            System.out.print(reverseArray[k] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
}
