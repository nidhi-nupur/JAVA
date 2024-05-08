public class arraysAsFunArgu2 {
        public static void main(String[] args) {
            int[] myArray = {1, 2, 3, 4, 5};
    
            // Pass the array to the method
            printArray(myArray);
    
            // Change the value of an element in the array
            myArray[0] = 10;
    
            // Print the array again
            printArray(myArray);
        }
    
        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
}
