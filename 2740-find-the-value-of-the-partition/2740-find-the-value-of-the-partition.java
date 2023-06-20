class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int part = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++)
            part = Math.min(part, nums[i+1]-nums[i]);
        
        return part;
    }
}
