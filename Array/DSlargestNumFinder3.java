// By taking negative infinity as the largest number.
public class DSlargestNumFinder3 {
    public static void main(String[] args) {
        int[] myArray = {10, 5, 20, 8, 15}; // Example Array.
        // Initialize the maximum value with negative infinity.
        int maxNumber = Integer.MIN_VALUE;
        // Traverse the array to find the maximum
        for(int i=0; i < myArray.length; i++) {
            if (myArray[i] > maxNumber) {
                maxNumber = myArray[i];
            }
        }
        System.out.println("The largest number in the array is : " + maxNumber);
    }
}
