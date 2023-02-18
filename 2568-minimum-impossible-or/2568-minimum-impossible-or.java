class Solution {
    public int minImpossibleOR(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int i: nums)
            set.add(i);
        int res = 1;
        while(set.contains(res))
            res *= 2;
        return res;
    }
}