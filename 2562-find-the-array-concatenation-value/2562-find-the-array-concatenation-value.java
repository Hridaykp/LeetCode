class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;int n = nums.length;
        int i = 0, j = n-1;
        while(i < j){
            String t = nums[i]+""+nums[j];
            ans += Long.valueOf(t);
            i++;j--;
        }
        if(n % 2 != 0)
            ans += nums[n/2];
        return ans;
    }
}