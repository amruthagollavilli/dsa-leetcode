class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxProfit = 0;
        int j = 0;
        int buy = prices[0];
        for(int i = 1 ; i<prices.length ;i++){
           if(buy > prices[j]){
              buy = prices[j];
           }
           j++;
                int sell = prices[i];
                profit = sell - buy;
                maxProfit = Math.max(maxProfit,profit);
                
            }
              return maxProfit;
        }
    }
