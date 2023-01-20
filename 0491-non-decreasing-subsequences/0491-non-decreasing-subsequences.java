class Solution {
    Set<List<Integer>> res;
    private void builder(int[] nums, int curr, List<Integer> list){
        if(list.size() >= 2)
            res.add(new ArrayList(list));     
        for(int i=curr; i<nums.length; i++){
            if(list.size()==0 || list.get(list.size()-1) <= nums[i]){
                list.add(nums[i]);
                builder(nums, i+1, list);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        res = new HashSet<>();
        builder(nums, 0, new ArrayList()); 
        return new ArrayList(res);
    }
}