class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0) return 0;
        int  cnt = 0;
        int prod = 1, si = 0;
        for(int i=0; i<nums.length; i++){
            prod *= nums[i];
            while(si <= i && prod >= k){
                prod /= nums[si];
                si++;
            }
            cnt += i-si+1;
        }
        return cnt;
    }
}