class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int left_p = 1;
        for (int i=0; i<n; i++){
            temp[i] = left_p;       
            left_p *= nums[i];
            
        }

        int right_p = 1;
        for (int i=n-1; i>=0; i--){
            temp[i] *= right_p;      
            right_p *= nums[i];     
        }

        return temp;
    }
}
