class Solution {
    public String convert(String s, int nRows) {
        char[] c = s.toCharArray();
        int n = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        for (int i = 0; i < sb.length; i++) 
            sb[i] = new StringBuffer();
        int i = 0;
        while (i < n) {
            for (int idx = 0; idx < nRows && i < n; idx++) 
                sb[idx].append(c[i++]);
            for (int idx = nRows-2; idx >= 1 && i < n; idx--) 
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }
}