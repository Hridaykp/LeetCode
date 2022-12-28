class Solution {
    public int minStoneSum(int[] piles, int k) {
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int n: piles)
            pq.add(n);
        while(k > 0){
            int max = pq.poll();
            pq.add(max - max/2);
            k--;
        }
        for(int n: pq)
            sum += n;
        return sum;
    }
}