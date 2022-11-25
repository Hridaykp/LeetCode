class Solution {
    public int maxDepth(String s) {
        int dep = 0, maxdep = 0;
        for(char ch: s.toCharArray()){
            if(ch == '(') {
                dep++;
                maxdep = Math.max(dep, maxdep);
            }    
            if(ch == ')') dep--;
        }
        return maxdep;
    }
}