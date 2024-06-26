import java.util.Scanner;

public class FirstOccurance {

    public static int firstOccur(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1; // Key not found.
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        System.out.println("The Array elements: ");
        for(int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Key: ");
        int key = sc.nextInt();

        System.out.println(firstOccur(arr, key, 0));

    }
}
