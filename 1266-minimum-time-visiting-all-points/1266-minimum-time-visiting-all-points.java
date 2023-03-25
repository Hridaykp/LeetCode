class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; ++i) {
            int[] cur = points[i], prev = points[i - 1];
            time += Math.max(Math.abs(cur[0] - prev[0]), Math.abs(cur[1] - prev[1]));
        }
        return time;        
    }
}