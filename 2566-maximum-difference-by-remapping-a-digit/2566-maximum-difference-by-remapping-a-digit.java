public class Solution {
    public int minMaxDifference(int num) {
        char[] max = String.valueOf(num).toCharArray();
        char[] min = String.valueOf(num).toCharArray();
        char c1 = max[0], c2 = max[0];
        for (int i=0; i < max.length; i++) {
            if (max[i] != '9') {
                c1 = max[i];
                break;
            }
        }       
        for (int i=0; i<max.length; i++) {
            if (max[i] == c1) {
                max[i] = '9';
            }
        }    
        for (int i=0; i<min.length; i++) {
            if (min[i] == c2) {
                min[i] = '0';
            }
        }     
        int max_Int = Integer.parseInt(String.valueOf(max));
        int min_Int = Integer.parseInt(String.valueOf(min));
        return max_Int - min_Int;
    }
}