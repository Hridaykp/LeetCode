class Solution {
    private String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public String reversePrefix(String word, char ch) {
        if(!word.contains(ch+"")) return word;
        int idx = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)!= ch)
                idx++;
            else
                break;
        }
        System.out.println(idx);
        return reverse(word.substring(0, idx+1))+word.substring(idx+1);
    }
}