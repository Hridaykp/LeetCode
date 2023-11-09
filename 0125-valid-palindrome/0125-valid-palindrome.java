class Solution {
    private String printable(String s){
        String org = "";
        String checker = "01234456789qwertyuioplkjhgfdsazxcvbnm";
        for(char c: s.toCharArray()){
            if(checker.contains(c+""))
                org += c;
        }
        return org;
    }
    public boolean isPalindrome(String s) {
        if (s == "") return true;
        String org = printable(s.toLowerCase());
        int i=0, j =org.length()-1;
        while(i < j){
            if(org.charAt(i++)!=org.charAt(j--))
                return false;
        }
        return true;
    }
}
