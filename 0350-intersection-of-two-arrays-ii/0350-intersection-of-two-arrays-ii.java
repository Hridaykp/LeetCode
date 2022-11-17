class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) 
            map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) > 0) {
                list.add(i);
                map.put(i, map.getOrDefault(i, 1) - 1);
            }
        }
        int[] arr = new int[list.size()];
        int k = 0;
        for (int i : list) 
            arr[k++] = i;
        return arr;
    }
}
    