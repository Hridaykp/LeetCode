class Solution {
    private boolean checker(int [] nums){
        int n=nums.length;
        int i=0, jump=0;
        while(i < n){
            if(i > jump) return false;
            jump = Math.max(jump, nums[i]+i);
            i++;
        }
        return true ;
    }
    public boolean canJump(int[] nums) {
        return checker(nums);
    }
}