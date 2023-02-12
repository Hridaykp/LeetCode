class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;int n = nums.length;
        int i = 0, j = n-1;
        if(n % 2 == 0){
            while(i < j){
                String t = nums[i]+""+nums[j];
                ans += Long.valueOf(t);
                i++;j--;
            }
        }else{
            while(i < j){
                String t = nums[i]+""+nums[j];
                ans += Long.valueOf(t);
                i++;j--;
            }
            ans += nums[n/2];
        }
        return ans;
    }
}