class Solution {
    private int recursion (int i, int j, int nums1[], int nums2[], Map<String, Integer> map){
        if(i == nums1.length || j == nums2.length)
            return 0;
        int cnt = 0;
        String key = i+"key"+j;
        if(map.containsKey(key))
            return map.get(key);
        if(nums1[i] == nums2[j])
            cnt = 1 + recursion(i+1, j+1, nums1, nums2, map);
        else
            cnt += Math.max(recursion(i+1, j, nums1, nums2, map),
                          recursion(i, j+1, nums1, nums2, map));
        map.put(key, cnt);
        return cnt;
    }
    
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        Map<String, Integer> map = new HashMap();
        return recursion(0, 0, nums1, nums2, map);
    }
}




