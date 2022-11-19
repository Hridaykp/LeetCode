class Solution {
    public int subtractProductAndSum(int n) {
        int x = n, prd = 1, sum =0;
        while(x != 0){
            int digit = x %10;
            prd *= digit;
            sum += digit;
            x /= 10;
        }
        return prd - sum;
    }
}