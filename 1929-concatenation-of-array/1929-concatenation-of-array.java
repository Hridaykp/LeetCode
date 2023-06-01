class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        int i=0;
        for(int j: nums)
            ans[i++] = j;
        for(int j: nums)
            ans[i++] = j;
        return ans;
    }
}