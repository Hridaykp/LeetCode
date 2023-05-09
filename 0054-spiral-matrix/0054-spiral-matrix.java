class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        List<Integer> res = new ArrayList();
        
        int left = 0, right = m-1;
        int top = 0, down = n-1;
        
        while (left <= right && top <= down) {
            for (int i=left; i<=right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            
            for (int i=top; i<=down; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            
            if (top <= down) {
                for (int i=right; i>=left; i--) {
                    res.add(matrix[down][i]);
                }
                down--;
            }
            
            if (left <= right) {
                for (int i=down; i>=top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return res;
    }
}