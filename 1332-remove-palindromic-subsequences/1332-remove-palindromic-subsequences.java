class Solution {
    private boolean isPalin(String s){
        String p = "";
        for(int i=s.length()-1; i>=0; i--)
            p += s.charAt(i);
        return s.equals(p);
    }
    public int removePalindromeSub(String s) {
        if(isPalin(s))
            return 1;
        return 2;
    }
}