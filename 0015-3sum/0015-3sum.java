class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if((i>0 && nums[i-1]!=nums[i])||i==0){
                if(nums[0] > 0) break;
                int l = i+1, r = n-1;
                while(l < r){
                    int sum = nums[l]+nums[r];
                    if(sum + nums[i] > 0){
                        r--;
                    }
                    else if(sum + nums[i] < 0){
                        l++;
                    }
                    else{
                        res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(l<r && nums[r]==nums[r-1]) r--;
                        l++;r--;
                    }
                }
            }
        }
        return res;
    }
}

// [-4, -1, -1, 0, 1, 2]