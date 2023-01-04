class Solution {
    public int minimumRounds(int[] tasks) {
        int minR = 0;
        Map<Integer, Integer> map = new HashMap();
        for(int task: tasks)
            map.put(task, map.getOrDefault(task,0) + 1);
        for(int freq: map.values()){
            if(freq < 2) 
                return -1;
            if(freq % 3 == 0)
                minR += freq / 3;
            else{
                minR += freq / 3 + 1;
            }
        }
        return minR;
    }
}