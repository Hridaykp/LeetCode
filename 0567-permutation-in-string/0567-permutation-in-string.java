public class Solution {
     private String sorting(String s) {
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
    public boolean checkInclusion(String s1, String s2) {
        s1 = sorting(s1);
        for (int i=0; i<=s2.length()-s1.length(); i++) {
            if (s1.equals(sorting(s2.substring(i, i + s1.length()))))
                return true;
        }
        return false;
    }   
}