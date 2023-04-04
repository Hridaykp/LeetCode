class Solution {
     public String sortString(String s) {
        char[] arr = s.toCharArray();
        int[] map = new int[256];
        StringBuilder sb = new StringBuilder();
        for (char c : arr)
            map[c]++;
        
        int count = 0;
        while (count < arr.length){
            for (int i = 0; i < 256; i++){
                if (map[i] > 0){
                    sb.append((char)(i));
                    map[i]--;
                    count++;
                }
            }
            
            for (int i = 255; i >= 0; i--){
                if (map[i] > 0){
                    sb.append((char)(i));
                    map[i]--;
                    count++;
                }
            }
        }
        
        return sb.toString();      
    }
}