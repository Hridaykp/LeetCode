class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt_busy = 0;
        for(int i=0; i<startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime)
                cnt_busy ++;
        }
        return cnt_busy;
    }
}