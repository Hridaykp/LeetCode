class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long i = 0, j = (long)Math.pow(10, 14);
        long minTime = j;
        while(i < j){
            long mid = i + (j-i)/2;
            long trip = 0;
            for(int k=0; k<time.length; k++){
                trip += mid/time[k];
            }
            if(trip >= totalTrips){
                minTime = Math.min(minTime, mid);
                j = mid;
            }
            else
                i = mid + 1;
        }
        return minTime;
    }
}