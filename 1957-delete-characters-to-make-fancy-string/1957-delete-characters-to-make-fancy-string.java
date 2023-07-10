class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        // String res = s.charAt(0)+"";
        int cnt = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                // res += s.charAt(i);
                sb.append(s.charAt(i));
                cnt = 1;
            }
            else{
                cnt++;
                if(cnt < 3) 
                    // res += s.charAt(i);
                    sb.append(s.charAt(i));
                
            }
            
        }
        return sb.toString();
    }
}