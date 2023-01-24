class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        if(k == 0)
            return Arrays.equals(nums1, nums2) ? 0: -1;
        int n = nums1.length, p = 0;
        int diff [] = new int [n];
        int i=0, sum = 0;
        long ops = 0;
        while(i<n)
            diff[p++]=nums1[i]-nums2[i++];
        for(int l: diff){
            if(l % k != 0) return -1;
            sum += l;
            if(l > 0) ops += l/k;
        }
        return sum == 0 ? ops : -1;
    }
}