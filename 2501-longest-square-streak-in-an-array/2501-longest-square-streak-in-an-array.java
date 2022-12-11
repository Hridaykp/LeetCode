class Solution {
    public int longestSquareStreak(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        Arrays.sort(nums);
        for(int i : nums){
            int root = (int)Math.sqrt(i);
            if(root * root == i)  
               map.put(i, map.getOrDefault(root, 0) + 1);
            else  
               map.put(i, 1);
            res = Math.max(res, map.get(i));
        }
        return res < 2 ? -1 : res;
    }
}