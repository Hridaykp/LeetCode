class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] check = new int[n+1];
        for(int person[]: trust){
            check[person[0]]--;
            check[person[1]]++;
        }
        for(int i = 1 ; i <= n; i++)
            if(check[i] == n-1)
                return i;
        return  -1;
    }
}