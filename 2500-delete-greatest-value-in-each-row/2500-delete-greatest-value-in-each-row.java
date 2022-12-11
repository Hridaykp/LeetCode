class Solution {
    public int deleteGreatestValue(int[][] grid){
        int m=grid.length, n=grid[0].length;
        for(int i=0 ;i<grid.length; i++)
            Arrays.sort(grid[i]);
        int res = 0;
        for(int i=0;i<n;i++){
            int max = 0;
            for(int j=0;j<m;j++){
                max = Math.max(max, grid[j][i]);
                // System.out.println(max+" => "+i+","+j);
            } 
            res += max;
        } 
        return res;
    }
}