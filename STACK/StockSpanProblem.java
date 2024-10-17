// DSA Question - AMAZON, FlipKart, Adobe, Microsoft, SAMSUNG.
// Question 4 : Stock Span Problem using Stack.

import java.util.*;

public class StockSpanProblem {

    // Method to find the span of the Daily Stocks by using STACK.
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> stack = new Stack<>();

        span[0] = 1; // Span of Day1 is by default 1 as it is equal to itself.
        stack.push(0);

        // This loop will calculate the Day-by-Day span of the stocks.
        for(int day = 1; day < stocks.length; day++) { // Starting from index 1 as the span at index 0 is already known i.e. 1.
            int currPrice = stocks[day]; // currPrice == CurrentPrice == Today's Price.
            while(!stack.isEmpty() && currPrice > stocks[stack.peek()]) { // Comparing currentPrice to the previous other prices. // By stack.peek() -> detect the index of the value. // By stocks[stack.peek()]-> find the value at that index.
                stack.pop(); // Removing the smaller prices.
            }
            if(stack.isEmpty()) {
                span[day] = day + 1; // 
            } else {
                int previousHigh = stack.peek();
                span[day] = day - previousHigh;
            }

            stack.push(day);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100}; // Stocks Prices from Day1 to Day7.
        int span[] = new int[stocks.length]; // Maximum number of consecutive days for which [Price(Stock Prices) <= Today's Price]
        stockSpan(stocks, span);

        for(int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " "); // Result: To print the Span of the entered Stocks.
        }
    }
}
