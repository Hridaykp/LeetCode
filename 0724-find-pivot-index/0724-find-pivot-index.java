class Solution {
    public int pivotIndex(int[] nums) {
        int Sum = 0;
        int leftSum = 0;
        for(int num : nums)
            Sum += num;
        for(int i=0; i<nums.length; i++){
            int rightSum = leftSum + nums[i];
            if(leftSum == Sum - rightSum)
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}