class Solution {
//     int ans;
//     private int isGoodPair(int[] nums){
//         ans=0;
        
//     }
    public int numIdenticalPairs(int[] nums) {
        int ans =0;
        Map<Integer,Integer> map = new HashMap();
        for(int i: nums)
            map.put(i, map.getOrDefault(i,0)+1);
        
        for(int i: map.keySet())
            if(map.get(i)>1)
                ans += map.get(i)*(map.get(i)-1)/2;
            
        return ans;
    }
}