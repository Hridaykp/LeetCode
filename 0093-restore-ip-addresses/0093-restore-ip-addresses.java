class Solution {
    List<String> res;
    private void validateStore(StringBuilder sb) {
        String r = sb.toString();
        String [] x = r.split("\\.");
        if(x.length != 4) return;
        for(String s : x) {
            if(s.length() == 0) return;
            long y = Long.parseLong(s);
            if(y < 10) {
                if(s.length() != 1) return;
            } else if(y > 99) {
                if(y > 255 || s.length() != 3) return;
            } else {
                if(s.length() !=2) return;
            }
        }
        res.add(r);
    }
    private void solve(char []str, int i, StringBuilder sb, int dots) {
        if(i == str.length || dots == 0) {
            if(dots == 0) {
                while(i!=str.length) {
                    sb.append(str[i++]);
                }
                validateStore(sb);
            }
            return;
        }
        int n = sb.length();
        sb.append(".");
        solve(str, i, sb, dots-1);
        sb.delete(n, sb.length());
        sb.append(str[i]);
        solve(str, i+1, sb, dots);
    }

    public List<String> restoreIpAddresses(String s) {
        res = new ArrayList<>();
        solve(s.toCharArray(), 0, new StringBuilder(), 3);
        return res;
    }
}