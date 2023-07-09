class Solution {
    // private boolean checker(int[] nums, int i){
    //     int n = nums.length;
    //     int sorted[] = new int[n];
    //     for(int i=0; i<n; i++)
    //         sorted[i] = nums[i];
    //     Arrays.sort(sorted);
    // }
    // public boolean check(int[] nums) {
    //     int n = nums.length;
    //     for(int i=0; i<n-1; i++){
    //         int arr[] = new int[n];
    //         if(checker(nums, i))
    //             return true;
    //     }
    //     return false;
    // }
    public boolean check(int[] nums) {
        int k = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > nums[(i+1)%n]) 
                k++;
            if (k > 1) 
                return false;
        }
        return true;
    }
}

