class Solution {
    int[] root = new int[26];

    private int find(int x) {
        return x == root[x] ? x : (root[x] = find(root[x]));
    }
    private void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            if (x < y)  
                root[y] = x;
            else 
                root[x] = y;
        }
        return;
    }
    
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        String res = "";
        for (int i = 0; i < 26; i++)  
            root[i] = i;
        for (int i = 0; i < s1.length(); i++) 
            unite(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        for (int i = 0; i < baseStr.length(); i++) {
            res += (char)(find(baseStr.charAt(i) - 'a') + 'a');
        }
        return res;
    }
}