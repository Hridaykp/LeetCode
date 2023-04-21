class Solution {
    private int helper(int[] nums, int index, int curr_Xor) {
        int xorSum = 0;
        if (index == nums.length) 
            return curr_Xor;
        
        int withElement = helper(nums, index + 1, curr_Xor ^ nums[index]);
        int withoutElement = helper(nums, index + 1, curr_Xor);
        xorSum = withElement+ withoutElement;
        return xorSum;
    }
    
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
}