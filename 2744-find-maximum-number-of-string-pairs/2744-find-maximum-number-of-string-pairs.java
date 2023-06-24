class Solution {
    private boolean isPair(String s1, String s2){
        StringBuilder sb = new StringBuilder(s2);
        return s1.equals(sb.reverse().toString());
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int cnt = 0;
        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if(isPair(words[i], words[j]))
                    cnt++;
            }
        }
        return cnt;
    }
}