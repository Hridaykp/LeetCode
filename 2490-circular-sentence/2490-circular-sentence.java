class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] word = sentence.split(" ");
        int n = word.length;
        // if(n == 1 && word[0].charAt(0)==word[0].charAt(word[0].length()-1)) return true;
        boolean res = true;
        for(int i=0; i<n; i++){
            int m = word[i].length();
            res &= word[i].charAt(m-1) == (i==n-1?word[0].charAt(0):word[i+1].charAt(0));
            // res &= word[0].charAt(0) == word[n-1].charAt(m-1);
            
        } 
        return res;
    }
}