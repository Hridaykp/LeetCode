class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0, digit = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int d = nums[i];
            while(d != 0){
                digit += d%10;
                d /= 10;
            }
        }
        return Math.abs(sum -digit);
    }
}