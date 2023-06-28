class Solution {
    public int[] buildArray(int[] nums) {
        int dup[] = new int [nums.length];
        for(int i=0; i<nums.length; i++){
            int p = nums[i];
            dup[i] = nums[p];
        }
        return dup;
    }
}