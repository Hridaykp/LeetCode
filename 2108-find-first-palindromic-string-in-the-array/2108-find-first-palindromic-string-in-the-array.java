class Solution {
    private boolean isPalin(String s){
        int i=0, j=s.length()-1;
        while(i < j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s: words)
            if(isPalin(s))
                return s;
        return "";
    }
}