class Solution {
    public int jump(int[] nums) {
        int longest = 0;
        int jumps = 0;
        int curr = 0;
        for(int i=0; i<nums.length-1; i++){
            longest = Math.max(i+nums[i], longest);
            if(i == curr){
                jumps++;
                curr = longest;
            }
            if(curr >= nums.length-1)
                return jumps;
        }
        return jumps;
    }
}