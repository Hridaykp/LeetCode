class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1) return -1;
        int n = grid.length, m = grid[0].length;
        int ans = 0;
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, 
                        {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int size = q.size();
            ans++;
            for (int i = 0; i < size; i++) {
                int[] curPos = q.poll();
                if (curPos[0] == n-1 && curPos[1] == m-1) {
                    return ans;
                }
                for (int[] dir : dirs) {
                    int nextX = curPos[0] + dir[0];
                    int nextY = curPos[1] + dir[1];

                    if (nextX<0 || nextX>=n || nextY<0 || nextY>=m ||                                     visited[nextX][nextY] || grid[nextX][nextY]==1) 
                        continue;
                    
                    visited[nextX][nextY] = true;
                    q.add(new int[]{nextX, nextY});
                }
            }
        }

        return -1;
    }
}