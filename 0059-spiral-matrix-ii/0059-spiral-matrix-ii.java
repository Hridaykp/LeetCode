class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        int left = 0, right = n-1, top = 0, down = n-1, num = 1;
        while (left <= right && top <= down) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            for (int i = top; i <= down; i++) {
                matrix[i][right] = num++;
            }
            right--;
            if (top <= down) {
                for (int i = right; i >= left; i--) {
                    matrix[down][i] = num++;
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        return matrix;
    }
}