class Solution {
    private boolean checker(String s, String p){
        int n = p.length();
        if(s.length() < n) return false;
        String sub = s.substring(0, n);
        return sub.equals(p);
    }
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for(String s: words)
            if(checker(s, pref))
                res++;
        return res;
    }
}