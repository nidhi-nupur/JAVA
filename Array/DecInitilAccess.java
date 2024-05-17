public class DecInitilAccess {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = new int[5]; // Creates an array with 5 elements

        // Initialize the array with values
        numbers[1] = 20;        
        numbers[3] = 40;
        numbers[2] = 30;        
        numbers[4] = 50;
        numbers[0] = 10;

        // Access and print each element of the array
        System.out.println("Array elements:");
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Second Element: " + numbers[1]);
        System.out.println("Third Element: " + numbers[2]);
        System.out.println("Fourth Element: " + numbers[3]);
        System.out.println("Fifth Element: " + numbers[4]);
    }
}
