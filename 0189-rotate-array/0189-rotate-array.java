class Solution {
    public void rotate(int[] nums, int k) {
        LinkedList<Integer> ll =new LinkedList();
        int n = nums.length;
        if(n<=k) k %= n;
        while(k-- > 0){
            ll.addFirst(nums[n-1]);
            n--;
        }
        int i=0,p=0;
        while(i<n) 
            ll.addLast(nums[i++]);
        for(int a: ll)
            nums[p++] = a;
    }
}