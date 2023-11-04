class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int left_p = 1;
        for (int i=0; i<n; i++){
            if (i > 0)
                left_p *= nums[i-1];
            temp[i] = left_p;
        }
        
        int right_p = 1;
        for (int i=n-1; i>=0; i--){
            if (i < n-1)
                right_p *= nums[i+1];
            temp[i] *= right_p;
        }
        return temp;
    }
}