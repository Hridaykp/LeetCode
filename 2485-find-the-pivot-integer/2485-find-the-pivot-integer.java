class Solution {
    public int pivotInteger(int n) {
        int  ans = 0;
        int x = n;
        while(x >= 1){
            ans += x;
            int sum = x* (x+1)/2;
            if(sum == ans) return x;
            x--;
        }
        return -1;
    }
}