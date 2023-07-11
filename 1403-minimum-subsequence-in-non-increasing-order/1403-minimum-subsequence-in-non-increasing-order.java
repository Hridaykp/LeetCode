class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList();
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0, max = 0;
        for(int i: nums) sum += i;
        for(int i=n-1; i>=0; i--){
            list.add(nums[i]);
            max += nums[i];
            if(sum - max < max )
                return list;
        }
        return list;
    }
}

/*
4,3,10,9,8
3,4,8,9,10
4,4,6,7,7
*/