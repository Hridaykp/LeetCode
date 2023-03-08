class Solution {
    private boolean isPalin(String s){
        StringBuilder p = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--)
            p.append(s.charAt(i));
        return s.equals(p.toString());
    }
    public int removePalindromeSub(String s) {
        if(isPalin(s))
            return 1;
        return 2;
    }
}