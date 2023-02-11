class Solution {
    private boolean canType(String s, String b){
        Set<Character> set = new HashSet();
        for(char c: b.toCharArray())
            set.add(c);
        for(char c: s.toCharArray())
            if(set.contains(c))
                return false;
        return true;
    }
    public int canBeTypedWords(String t, String b) {
        int cnt = 0;
        String words[] = t.split(" ");
        for(String word: words){
            if(canType(word, b)){
                cnt++;
                // break;
            }
        }
        return cnt;
    }
}