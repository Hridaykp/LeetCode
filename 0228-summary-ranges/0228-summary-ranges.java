class Solution {
    private void builder(int nums[], List<String> res){
        if(nums.length == 0) return;
        for(int i=0; i<nums.length; i++){
            int start = nums[i];
            while(i<nums.length-1 && nums[i+1]-nums[i]==1 ){
                i++;
            }
            if(start != nums[i])
                res.add(start + "->" + nums[i]);
            else 
                res.add("" + nums[i]); 
        }
    }
    public List<String> summaryRanges(int[] nums) {
        List<String> res =new ArrayList();
        builder(nums, res);
        return res;
    }
}