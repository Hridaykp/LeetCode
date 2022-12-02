class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length() != w2.length()) return false;
        Map<Character,Integer> map1 = new HashMap();
        Map<Character,Integer> map2 = new HashMap();
        for(char ch: w1.toCharArray())
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        for(char ch: w2.toCharArray())
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        if(!map1.keySet().equals(map2.keySet()))
            return false;
        List<Integer> freq1 = new ArrayList(map1.values());
        List<Integer> freq2 = new ArrayList(map2.values());
        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);
    }
}