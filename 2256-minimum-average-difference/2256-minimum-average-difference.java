class Solution {
    public int minimumAverageDifference(int[] nums) {
        int res = 0;
        long sum = 0,currSum=0;
        for(int num: nums) sum += num;
        int avg = Integer.MAX_VALUE,n=nums.length;
        for(int i=0; i<n; i++){
             currSum += nums[i];
            int currAvg = (int)Math.abs(currSum/(i+1)-((i==n-1)?0:(sum-currSum)/(n-i-1)));
            if(avg>currAvg){
                avg = currAvg;
                res = i;
            }
        }
        return res;
    }
}