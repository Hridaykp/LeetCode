// class Solution { 
//     private boolean isValid(String s){
//         int c_0=0, c_1=0;
//         for(int i=0; i<s.length()-1; i++){
//             if(s.charAt(i) == '0'&&s.charAt(i+1)=='0'){
//                 c_0++;
//             }  
//             else if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
//                 c_1++;
//             }    
//         }
//         System.out.println(c_0+","+c_1+","+s);
//         return c_0 == c_1;
        
//     }
//     public int countBinarySubstrings(String s) {
//         int res=0;
//         for(int i=0;i<s.length();i++){
//             for(int j=i+1;j<=s.length();j++){
//                 if(isValid(s.substring(i,j)))
//                     res++;                                                
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public int countBinarySubstrings(String s) {
        int curr = 1, prev = 0, ans = 0;
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == s.charAt(i-1)) 
                curr++;
            else {
                ans += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        return ans + Math.min(curr, prev);
    }
}