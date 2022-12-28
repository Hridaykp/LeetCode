class Solution {
    public int minStoneSum(int[] piles, int k) {
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i=0; i<piles.length; i++){
            pq.add(piles[i]);
            
        }
        int i=0;
        while(i < k){
            int max = pq.poll();
            pq.add(max - max/2);
            k--;
        }
        for(int n: pq)
            sum += n;
        return sum;
    }
}