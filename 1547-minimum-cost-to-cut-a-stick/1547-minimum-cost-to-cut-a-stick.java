class Solution {
    public int minCost(int n, int[] cuts) {
        List<Integer> list = new ArrayList();
        for (int cut : cuts)
            list.add(cut);

        list.addAll(Arrays.asList(0, n));
        Collections.sort(list);
        int size = list.size();
        int[][] dp = new int[size][size];
        for (int i = size - 1; i >= 0; --i)
            for (int j = i + 1; j < size; ++j) {
                for (int k = i + 1; k < j; ++k)
                    dp[i][j] = Math.min(dp[i][j] == 0 ? Integer.MAX_VALUE : dp[i][j],
                        list.get(j) - list.get(i) + dp[i][k] + dp[k][j]);
            }
        return dp[0][size - 1];    
    }
}