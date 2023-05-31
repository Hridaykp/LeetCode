class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        Set<Character> set = new HashSet();
        for(char c: allowed.toCharArray())
            set.add(c);
        for(String word: words){
            for(int i=0; i<word.length(); i++){
                char c = word.charAt(i);
                if(!set.contains(c))
                    break;
                if(i == word.length()-1)
                    cnt++;
            }
        }
        return cnt;
    }
}