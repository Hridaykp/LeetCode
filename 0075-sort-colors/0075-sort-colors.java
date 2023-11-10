class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int lo = 0, hi = n-1;
        int curr= 0;
        while(curr<=hi){
            if(nums[curr]==0){
                nums[curr] =nums[lo];
                nums[lo]=0;
                lo++;
                curr++;
                
            }
           else if (nums[curr] == 2) {
                nums[curr] = nums[hi];
                nums[hi] = 2;
                hi--;
                // curr--;
            }
            else curr++;
        }
    }
}