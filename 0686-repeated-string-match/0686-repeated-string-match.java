class Solution {
    public int repeatedStringMatch(String a, String b) {
        int l1 = a.length(), l2 = b.length(), count = 0;
        String temp = "";
        while(temp.length() <= l1 + l2){
            temp += a;
            count++;
            if(temp.indexOf(b) != -1)
                return count;
        }
        return -1;
    }
}