class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] dup = new int[arr.length];
        int j=0;
        for(int n: arr) dup[j++] = n;
        Arrays.sort(dup);
        Map<Integer, Integer> map = new HashMap();
        for(int i=0; i<dup.length; i++)
            map.putIfAbsent(dup[i], map.size()+1);
        int res [] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
            res[i] = map.get(arr[i]);
        return res;
    }
}