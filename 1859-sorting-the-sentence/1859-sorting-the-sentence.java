class Solution {
    public String sortSentence(String s) {
        String [] arr = s.split(" ");
        String[] res = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            int n = arr[i].length();
            int idx = Integer.valueOf(arr[i].charAt(n-1))-'1';
            res[idx] = arr[i].substring(0, n-1);
        }
        
        return String.join(" ", res);
    }
}