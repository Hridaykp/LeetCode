class Solution {
    private int length(String s){
        String [] st = s.split(" ");
        return st.length;
    }
    public int mostWordsFound(String[] sentences) {
        int most  = 0;
        for(String s: sentences)
            most = Math.max(most, length(s));
        return most;
    }
}