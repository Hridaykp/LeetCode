class Solution {
    public int minFlipsMonoIncr(String s) {
        int count_1s = 0, changes = 0;
        for(char ch: s.toCharArray()){
            if(ch == '0'){
                if(count_1s == 0)
                    continue;
                else 
                    changes ++;  
            }
            else{
                count_1s ++;
            }
            changes = Math.min(count_1s, changes);
        }
        return changes;
    }
}