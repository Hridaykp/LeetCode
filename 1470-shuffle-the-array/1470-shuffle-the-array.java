class Solution {
    public int[] shuffle(int[] nums, int n) {
        int p = 0,j = n,i = 0;
        int arr[] = new int[2*n];
        while(j<2*n){
            if(p%2 == 0)
                arr[p++] = nums[i++];
            else
                arr[p++] = nums[j++];
        }
        return arr;
    }
}