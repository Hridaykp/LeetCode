class Solution {
    public int commonFactors(int a, int b) {
        int cf=0;
        int n = a > b ? b : a;
        for(int i=1; i<=n; i++)
            if(a % i == 0 && b % i == 0){
                System.out.println(i+",");
                cf++;
            }
        return cf;
    }
}