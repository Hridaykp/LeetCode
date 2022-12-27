class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int max = 0;
        int n = rocks.length;
        int extra_cap[] = new int [n];
        for(int i=0,j=0; i<n; i++)
            extra_cap[j++] = capacity[i]-rocks[i];
        Arrays.sort(extra_cap);
        for(int i=0; i<n; i++){
            if(additionalRocks >= extra_cap[i]){
                additionalRocks -= extra_cap[i];
                max++;
            }
        }
        
        return max;
    }
}