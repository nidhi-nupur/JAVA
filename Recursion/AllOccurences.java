import java.util.Scanner;

public class AllOccurences {

    public static void findAllOccurrences(int[] arr, int key, int index) {
        // Base case 
        if (index == arr.length) {
            return; // when reached the end of the array
        } 
        
        // If the current element matches the key, print its index
        if (arr[index] == key) {
            System.out.print(index + " ");
        }

        // Recur for the next index
        findAllOccurrences(arr, key, index + 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key to find occurrences: ");
        int key = sc.nextInt();

        System.out.print("Occurrences at indices: ");
        findAllOccurrences(arr, key, 0);

        sc.close();
    }
}
