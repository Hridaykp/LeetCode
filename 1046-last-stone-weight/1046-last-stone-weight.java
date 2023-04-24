class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int stone: stones) 
            pq.add(stone);
        int x = 0, y = 0;
        while(pq.size() > 1){
            x = pq.poll();
            y = pq.poll();
            if(x != y)
                pq.add(x - y);
        }
        return pq.size()==0? 0: pq.poll();
    }
}