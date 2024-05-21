public class trappedRainwater {
    public static int RainwaterTrapped(int height[]) { // TC = O(n)
        int n = height.length;
        //Calculate left max boundary - auxiliary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //Calculate right max boundary - auxiliary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        
        int trappedwater = 0;
        //loop
        for(int i=0; i<n; i++) {
            //waterLevel = min(leftmax boundary, rightMax boundary) 
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water = waterLevel - height[i]
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        //int height[] = {4, 2, 0, 6, 3, 2, 5};
        //int height[] = {6, 0, 0, 0, 0, 0, 7};
        //int height[] = {0, 0, 0, 2, 4, 0, 0};
        int height[] = {0, 2, 0, 2, 4, 0, 1};
        System.out.println(RainwaterTrapped(height));
    }
}     
