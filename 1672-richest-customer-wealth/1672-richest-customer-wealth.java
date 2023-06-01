class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int acc[] : accounts){
            int wealth = 0;
            for(int i: acc){
                wealth += i;
                max = Math.max(max, wealth);
            }    
        }
        return max;
    }
}