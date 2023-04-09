class Solution {
    private boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<=Math.sqrt(num); i++)
            if(num % i == 0) return false;
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            if(isPrime(nums[i][i]))
                ans = Math.max(ans, nums[i][i]);
            
        }
        for(int i=0; i<n; i++){
            if(isPrime(nums[n-i-1][i]))
                ans = Math.max(ans, nums[n-i-1][i]);
        }
        return ans;
    }
}