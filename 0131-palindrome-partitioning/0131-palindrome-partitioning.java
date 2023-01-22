class Solution {
    private boolean isPalin(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0; i--)
            rev += s.charAt(i);
        return s.equals(rev);
    }
    private void builder(List<List<String>>res, List<String> list, String s, int start){
        if(start >= s.length()) {
            res.add(new ArrayList(list));
            return;
        }
        for(int i=start; i<s.length(); i++){
            String sub = s.substring(start, i+1);
            if(isPalin(sub)){
                list.add(sub);
                builder(res, list, s, i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList();
        builder(res, new ArrayList(), s, 0);
        return res;
    }
}