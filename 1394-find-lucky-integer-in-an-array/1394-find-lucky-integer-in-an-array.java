class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap();
        for(int i: arr)
            map.put(i, map.getOrDefault(i,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i: map.keySet())
            if(i == map.get(i))
                pq.add(i);
        return pq.size()>0 ?pq.poll():-1;
    }
}