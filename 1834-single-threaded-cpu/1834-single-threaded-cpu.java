class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> (a[1] != b[1] ? (a[1] - b[1]) : (a[2] - b[2])));
        
        int sortedTasks[][] = new int[n][3];
        for (int i = 0; i < tasks.length; ++i) {
            sortedTasks[i][0] = tasks[i][0];
            sortedTasks[i][1] = tasks[i][1];
            sortedTasks[i][2] = i;
        }
        
        Arrays.sort(sortedTasks, (a, b) -> Integer.compare(a[0], b[0]));
        int res[] = new int[n];
        long currTime = 0;
        int taskIndex = 0;
        int ansIndex = 0;
        
        while (taskIndex < n || !pq.isEmpty()) {
            if (pq.isEmpty() && currTime < sortedTasks[taskIndex][0]) 
                currTime = sortedTasks[taskIndex][0];
            
            while (taskIndex < n && currTime >= sortedTasks[taskIndex][0]) 
                pq.add(sortedTasks[taskIndex++]);
            
            int processTime = pq.peek()[1];
            int index = pq.peek()[2];
            pq.remove();
            
            currTime += processTime; 
            res[ansIndex++] = index;
        }
        
        return res;
    }
}