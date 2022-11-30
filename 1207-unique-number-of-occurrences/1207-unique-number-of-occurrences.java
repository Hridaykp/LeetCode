class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap();
        int cnt = 0;
        for(int n: arr)
            map.put(n, map.getOrDefault(n,0)+1);
        Set<Integer> set = new HashSet();
        for(int freq: map.values()){
            if(set.contains(freq))
                return false;
            set.add(freq);
        }
        
        return true;
    }
}