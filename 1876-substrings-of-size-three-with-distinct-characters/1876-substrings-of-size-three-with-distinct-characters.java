class Solution {
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        for(int i=0; i<s.length()-2; i++){
            String sub = s.substring(i,i+3);
            Set<Character> set = new HashSet();
            for(char c: sub.toCharArray())
                set.add(c);
            if(sub.length() == set.size())
                cnt++;
        }
        return cnt;
    }
}