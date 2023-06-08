class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        int n = grid[0].length;
        for(int arr[]: grid){
            int l = 0, r = n-1;
            while(l <= r){
                int mid = l+(r-l)/2;
                if(arr[mid] < 0)
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            cnt += n-l;
        }
        return cnt;
    }
}