class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()][text2.length()];
        for(int i=0; i<text1.length(); i++)
            for(int j=0; j<text2.length(); j++)
                dp[i][j] = -1;
        return solver(text1, text2, 0, 0);
    }
    private int solver(String text1, String text2, int idx1, int idx2){
        if(idx1 == text1.length() || idx2 == text2.length())
            return 0;
        if(dp[idx1][idx2] >= 0) 
            return dp[idx1][idx2];
        if(text1.charAt(idx1) == text2.charAt(idx2))
            dp[idx1][idx2] = 1 + solver(text1, text2, idx1+1, idx2+1);
        else
            dp[idx1][idx2] = Math.max(solver(text1, text2, idx1+1, idx2),
                                      solver(text1, text2, idx1, idx2+1));
        
        return dp[idx1][idx2];
    }
}