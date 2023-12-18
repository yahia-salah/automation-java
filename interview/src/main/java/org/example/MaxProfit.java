package org.example;


public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit=0;

        for(int i=0;i<prices.length;i++){
            int currentPrice = prices[i];
            int highestPrice=0;

            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>=highestPrice)
                {
                    highestPrice=prices[j];
                }
            }

            if(highestPrice-currentPrice>profit)
                profit=highestPrice-currentPrice;
        }

        return profit;
    }
}
