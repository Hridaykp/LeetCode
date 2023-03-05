class Solution {
    public int divisorSubstrings(int num, int k) {
        String Num = num + "";
        int i=0, cnt = 0;
        while(i<k && k<=Num.length()){
            String Sub = Num.substring(i, k);
            int sub = Integer.valueOf(Sub);
            if(sub != 0 && num % sub == 0)
                cnt++;
            i++;k++;
        }
        return cnt;
    }
}