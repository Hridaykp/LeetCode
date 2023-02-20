class Solution {
    public int searchInsert(int[] nums, int t) {
        int i = 0, j = nums.length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(t == nums[mid]) return mid;
            if(t < nums[mid]) j = mid - 1;
            else i = mid + 1;
        }
        return i;
    }
}