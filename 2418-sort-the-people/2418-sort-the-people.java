class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap();
        for(int i=0; i<heights.length; i++)
            map.put(heights[i],names[i]);
        List<Integer> list = new ArrayList();
        for(int i: heights)
            list.add(i);
        Collections.sort(list, Collections.reverseOrder());
        String[] ans = new String[heights.length];
        int j=0;
        for(int i: list)
            ans[j++] = map.get(i);
        return ans;
    }
}