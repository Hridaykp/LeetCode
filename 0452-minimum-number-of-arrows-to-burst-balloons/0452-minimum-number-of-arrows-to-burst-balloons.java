class Solution{
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) 
            return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        int end_pos = points[0][1];
        int min_Arrow = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end_pos) {
                min_Arrow++;
                end_pos = points[i][1];
            }
            else
                continue;
        }
        return min_Arrow;
    }
}