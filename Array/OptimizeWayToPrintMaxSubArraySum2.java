public class OptimizeWayToPrintMaxSubArraySum2 {
    public static void kadanes(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("The maximum Subarray sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, 5, -1, 2, -3};
        kadanes(numbers);
    }
}
