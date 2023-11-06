class Solution {
    public int maxSubArray(int[] nums) {
        int maxS = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            maxS = Math.max(sum, maxS);
            if(sum < 0) 
                sum = 0;
        }
        return maxS;
    }
}