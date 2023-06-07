class Solution {
    public int minFlips(int a, int b, int c) {
        int min = 0;
        if(a==0 && b==0 && c==0) return 0;
        if((c & 1) == 0){
            if((a & 1) == 1)
                min++;
            if((b & 1) == 1)
                min++;
        }
        else{
            if((a&1)==0 && (b&1)==0)
                min++;
        }
        // if()
        return min + minFlips(a>>1, b>>1, c>>1);
    }
}
/*
0010 =>2
0110 =>6
----
0110 =>6 a|b

0010 =>2 a&b
0101 =>5 
--------




*/



