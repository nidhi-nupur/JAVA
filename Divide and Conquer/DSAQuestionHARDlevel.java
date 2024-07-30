/*                                                Inversion Count:
                                            leftElement > rightElements
                                                 arr[i] > arr[j]
                                                        j > i 
*/

// Brute Force : Without Function 
// TC = O(n^2)
// SC = O(1) (constant)
public class DSAQuestionHARDlevel { 
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 1};
        int count = 0;

        // From arr[0] to arr[n - 1]
        for(int i = 0; i < arr.length - 1; i++) {
            // From arr[1] to arr[n]
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println("The total count of Inversion in given array is " + count);
    }
}