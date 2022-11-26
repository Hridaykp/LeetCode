class Solution {
    public int countPrimes(int n) {
        boolean notprimes [] = new boolean[n];
        int count = 0;
        for(int i=2; i<n; i++){
            if(!notprimes[i]){
                count++;
                for(int j=2; i*j<n; j++)
                    notprimes[i*j] = true;
            }
        } 
        return count;
    }
}