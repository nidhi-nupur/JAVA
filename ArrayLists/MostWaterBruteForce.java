import java.util.ArrayList;
 // TC = O(n^2)
/* // Without using function/Method
public class MostWaterBruteForce {  
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        int maxWater = 0;
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int finalHeight = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currentWaterVolume = finalHeight * width;
                maxWater = Math.max(maxWater, currentWaterVolume);
            }
        }
        System.out.println("The maximum amount of water is: " + maxWater);
    }
} */


// Using Function/Method
public class MostWaterBruteForce {

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int finalHeight = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currentWaterVolume = finalHeight * width;
                maxWater = Math.max(maxWater, currentWaterVolume);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println("The maximum amount of water is: " + storeWater(height));
    }
}
