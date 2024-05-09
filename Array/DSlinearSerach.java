public class DSlinearSerach {
    public static int linearSearch(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                return i; // Element found.
            }
        }
        return -1; // Element not found.
    }
    public static void main(String[] args) {
        int arr[] = {20, 30, 40, 50, 60, 70, 80, 90, 10};
        int key = 60;
        int index = linearSearch(arr, key);
        if(index == -1) {
            System.out.println("Element NOT found");
        } else { 
            System.out.println("Key is at index : " + index);
        }
    }
}