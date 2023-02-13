class Solution {
    public int countOdds(int l, int h) {
        int total = h-l+1;
        if(l%2 != 0 && h%2 != 0)
            return total/2 +1;
        return total/2;
    }
}