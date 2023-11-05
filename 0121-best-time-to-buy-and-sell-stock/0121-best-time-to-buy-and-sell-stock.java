class Solution {
    public int maxProfit(int[] prices) {
        int max_p = 0;
        int buy = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i] > buy)   
                max_p = Math.max(max_p, prices[i]-buy);
            else
                buy = prices[i];
        }
        return max_p;
    }
}