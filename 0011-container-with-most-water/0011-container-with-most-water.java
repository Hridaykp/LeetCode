class Solution {
    public int maxArea(int[] height) {
        int maxA = 0;
        int n = height.length;
        int area = 0;
        int i = 0, j = n-1;
        while(i < j){
            area = (j-i) * Math.min(height[i], height[j]);
            maxA = Math.max(area, maxA);
            if(height[i] > height[j]) j--;
            else i++;
        }
        return maxA;
    }
}