class Solution {
    private int bitCount (String s){
        int ones = 0;
        for(char c: s.toCharArray())
            if(c == '1')
                ones++;
        return ones;
    }
    public boolean makeStringsEqual(String s, String t) {
        int ones_s = bitCount(s);
        int ones_t = bitCount(t);
        return s.equals(t) || (ones_s >= 1 && ones_t >= 1);
    }
}