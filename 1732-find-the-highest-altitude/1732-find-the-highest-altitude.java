class Solution {
    public int largestAltitude(int[] gain) {
        int larg = 0,temp = 0;
        for(int i=0; i<gain.length; i++){
            temp += gain[i];
            larg = Math.max(temp, larg);
        }
        return larg;
    }
}