public class PrintMaxSubArraySum {
    public static void maxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) { // for starting index
            int start = i;
            for(int j=i; j<numbers.length; j++) { // for ending index
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++) { // to calculate sum
                    // Print subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) { // to check if the sum is max or not
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum); // print the max Subarray sum.
    }
    public static void main(String[] args) {
        int numbers[] = {2, -1, 6, -2, 1, 3};
        maxSubArraySum(numbers);
    }
}
