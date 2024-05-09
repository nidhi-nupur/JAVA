// By taking first element of array as the Maximum number.
public class DSlargestNumFinder2 {
    public static void main(String[] args) {
        int[] myArray = {10, 5, 20, 8, 15}; // Example Array
        // Initializing the maximum value with the 1st elements.
        int maxNumber = myArray[0];
        // Traverse the array to find the maximum.
        for(int i=0; i < myArray.length; i++) {
            if (myArray[i] > maxNumber) {
                maxNumber = myArray[i];
            }
        }
        System.out.println("The largest number in the array is : " + maxNumber);
    }
}
