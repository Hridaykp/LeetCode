class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        Set<Integer> set = new HashSet();
        for(int i: nums) set.add(i);
        for(int i=0; i<=n; i++) 
            if(!set.contains(i))
                return i;
        return -1;
    }
}