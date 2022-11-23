class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList();
        for(int i=0; i<nums.length-1; i +=2){
            int freq = nums[i];
            int val = nums[i+1];
            int j=0;
            while(j < freq){
                list.add(val);
                j++;
            }
        }
        int k=0;
        int res [] = new int[list.size()];
        for(int n: list)
            res[k++] = n;
        return res;
    }
}