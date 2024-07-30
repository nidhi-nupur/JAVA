/*                                                Inversion Count: in two arrays
                                                     leftElement > rightElements
                                                         arr1[i] > arr2[j]
*/

// Brute Force : Without Function 
// TC = O(n^2)
// SC = O(n)

public class DSAQuestionHARDlevelTwoArraysInputs {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 5, 6};
        int arr2[] = {2, 2, 4, 4, 8};
        int count = 0;
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) {
                    count++;
                }
            }
        }
        System.out.println("The total number/count of Inversion from arr1 to arr2 are " + count);
    }
}
