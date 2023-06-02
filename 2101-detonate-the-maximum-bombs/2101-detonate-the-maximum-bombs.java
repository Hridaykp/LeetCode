class Solution {
    private boolean isInRange(int []p1, int[] p2){
        long dx = p1[0] - p2[0];
        long dy = p1[1] -p2[1];
        long r1 = p1[2];
        long dist = dx*dx + dy*dy;
        return dist <= r1*r1;
    }
    private int dfs(int[][]bombs, int idx, boolean[] visited){
        int bomb = 1;
        visited[idx] = true;
        for(int i=0; i<bombs.length; i++){
            if(!visited[i] && isInRange(bombs[idx], bombs[i])){
                bomb += dfs(bombs, i, visited);
            }
        }
        return bomb;
    }
    public int maximumDetonation(int[][] bombs) {
        int max = 0;
        for(int i=0; i<bombs.length; i++){
            max = Math.max(max, dfs(bombs, i, new boolean[bombs.length]));
        }
        return max;
    }
}