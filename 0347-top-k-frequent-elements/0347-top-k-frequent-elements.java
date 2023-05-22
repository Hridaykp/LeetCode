class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) 
            map.put(num, map.getOrDefault(num, 0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue((a, b) -> map.get(b) - map.get(a));
        for (int num : map.keySet()) 
            pq.add(num);
        System.out.println(pq);
        
        int[] result = new int[k];
        int i = 0;
        while(i < k)
            result[i++] = pq.poll();
        
        return result;
    }
}