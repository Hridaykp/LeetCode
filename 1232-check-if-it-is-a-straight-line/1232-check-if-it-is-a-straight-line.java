class Solution {
    public boolean checkStraightLine(int[][] cord) {
        int x0 = cord[0][0], y0 = cord[0][1], 
            x1 = cord[1][0], y1 = cord[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        for (int[] co : cord) {
            int x = co[0], y = co[1];
            if (dx * (y - y1) != dy * (x - x1))
                return false;
        }
        return true;
    }
}