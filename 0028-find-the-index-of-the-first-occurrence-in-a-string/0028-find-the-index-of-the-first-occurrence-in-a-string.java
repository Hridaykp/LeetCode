class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        int i=0;
        if(n < m) return -1;
        while(i < n){
            if(haystack.indexOf(needle)!=-1)
                return haystack.indexOf(needle);
            i++;
        }
        return -1;
    }
}