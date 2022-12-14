class Solution {
    public int rob(int[] nums) {
        int rob = 0, notrob = 0;
        for(int i=0; i<nums.length; i++){
            int curr_rob = notrob + nums[i];
            notrob = Math.max(rob, notrob);
            rob = curr_rob;
            // System.out.println(curr_rob+","+notrob+","+rob);
        }
        
        return Math.max(rob, notrob);
    }
}