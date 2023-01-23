class Solution {
    public int findJudge(int n, int[][] trust) {
        Set<Integer> set = new HashSet();
        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i<trust.length; i++){
            set.add(trust[i][0]);
            int key = trust[i][1];
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        for(int key: map.keySet()){
            if(!set.contains(key) && map.get(key) == n-1)
                return key;
        }
        return n == 1 ? 1 : -1;
    }
}