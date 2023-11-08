class Solution {
    public int maxProduct(int[] nums) {
        int maxP = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int pro = 1;
            for(int j=i; j<nums.length; j++){
                pro *= nums[j];
                maxP = Math.max(maxP, pro);
            }
        }
        return nums.length < 2 ? nums[0] : maxP;
    }
}