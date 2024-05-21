public class BuyandSellStocks {
    public static int buyAndSellStocks(int sellingPrices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i < sellingPrices.length; i++) {
            if(buyPrice < sellingPrices[i]) { // profit
                int profit = sellingPrices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit); // profit in total
            } else {
                buyPrice = sellingPrices[i]; // when selling price< buying price, it's better to buy it instead of selling it. 
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int sellingPrices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(sellingPrices));
    }
}
// TC = O(n);