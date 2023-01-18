class Solution {
    private int kadane_s (int[] nums){
        int max = Integer.MIN_VALUE, curr_sum = 0;
        for(int i=0; i<nums.length; i++){
            curr_sum += nums[i];
            if(curr_sum > max)
                max = curr_sum;
            if(curr_sum < 0)
                curr_sum = 0;
        }
        return max;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int org = kadane_s(nums);        // before change sign sum
        int total = 0;
        for(int i=0; i<nums.length; i++){
            total += nums[i];
            nums[i] *= -1;              //change sign 
        }
        int neg_total = kadane_s(nums);
        if(neg_total+total == 0) return org;
        return Math.max(org, neg_total+total);
    }
}
