class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder Sb = new StringBuilder();
        Map<Integer, Character> map = new HashMap();
        int i=0;
        while(i < s.length()){
            map.put(indices[i], s.charAt(i));
            i++;
        }
        Arrays.sort(indices);
        for(int idx: indices)
            Sb.append(map.get(idx));
        return Sb.toString();
    }
}