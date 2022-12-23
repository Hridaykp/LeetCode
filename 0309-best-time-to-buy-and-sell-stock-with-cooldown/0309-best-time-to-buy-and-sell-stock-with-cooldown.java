class Solution {
    private int solver(int[] prices, int idx, int sellOrBuy, Map<String,Integer>map){
        if(idx >= prices.length) return 0;
        String key = sellOrBuy+"trading"+idx;
        if(map.containsKey(key))
            return map.get(key);
         int profit = 0;
        if(sellOrBuy == 0){
            int buy = solver(prices, idx + 1, 1, map) - prices[idx];
            int no_buy = solver(prices, idx + 1, 0, map);
            profit = Math.max(buy, no_buy);
        }
        else{
            int sell = solver(prices, idx + 2, 0, map) + prices[idx];
            int no_sell = solver(prices, idx + 1, 1, map);
            profit = Math.max(sell, no_sell);
        }
        map.put(key, profit);
        return profit;
    }
    public int maxProfit(int[] prices) {
        Map<String,Integer> map = new HashMap();
        return solver(prices, 0, 0, map);
    }
}