class Solution {
    public int arraySign(int[] nums) {
        int count_Neg = 0;
        for (int num : nums) {
            if (num == 0) 
                return 0;
            if (num < 0) 
                count_Neg++;
        }
        return count_Neg % 2 == 0 ? 1 : -1;
    }
}