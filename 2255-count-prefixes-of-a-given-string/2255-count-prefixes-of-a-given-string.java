class Solution {
    private List<String> subString(String s){
        List<String> list = new ArrayList();
        int i = 0;
        while(i <= s.length()){
            list.add(s.substring(0,i));
            i++;
        }
        return list;
    }
    public int countPrefixes(String[] words, String s) {
        List<String> list = subString(s);
        Set<String> set = new HashSet();
        for(String p: list)
            set.add(p);
        int count = 0;
        for(String w: words)
            if(set.contains(w))
                count++;
        return count;
    }
}