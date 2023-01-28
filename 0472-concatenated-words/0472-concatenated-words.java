class Solution {
    Set<String> set;                            
    private boolean isConcat(String word){
        int n = word.length();
        for(int i=1; i<n; i++){
            String suff = word.substring(i);
            String pref = word.substring(0, i);
            if(set.contains(pref) && (isConcat(suff) || set.contains(suff)))
                return true;
        }
        return false;
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> list = new ArrayList();
        set = new HashSet();
        for(String word: words)
            set.add(word);
        for(String word: words)
            if(isConcat(word))
                list.add(word);
        return list;
    }
}