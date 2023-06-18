class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        for(String s: details){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == 'M'||s.charAt(i) == 'F'|| s.charAt(i) == 'O'){
                    int j = i+1;
                    // while(j<i+3){
                        if(Integer.valueOf(s.substring(j, i+3)) > 60)
                            cnt++;
                    // }
                }   
            }
        }
        return  cnt;
    }
}