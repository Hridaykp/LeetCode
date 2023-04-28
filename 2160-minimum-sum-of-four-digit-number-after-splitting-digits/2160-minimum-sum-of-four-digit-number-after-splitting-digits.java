class Solution {
    public int minimumSum(int num) {
        String min1 = "", min2 = "";
        PriorityQueue <Integer> pq = new PriorityQueue();
        while(num != 0){
            pq.add(num % 10);
            num /= 10;
        }
        while(!pq.isEmpty()){
            min1 += pq.poll();
            min2 += pq.poll();
        }
        return Integer.parseInt(min1)+Integer.parseInt(min2);
    }
}