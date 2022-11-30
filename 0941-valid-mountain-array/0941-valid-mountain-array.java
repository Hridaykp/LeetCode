class Solution {
    public boolean validMountainArray(int[] arr) {
        int n =arr.length;
        int [] temp = new int[n];
        for(int i=0; i<n; i++)
            temp[i] = arr[i];
        Arrays.sort(temp);
        int peek = temp[n-1];
        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i<n; i++)
           map.put(arr[i], i);
        boolean flag1 = true, flag2 = true;
        for(int i=0; i<map.get(peek); i++)
            flag1 &= (arr[i] < arr[i+1]);

        for(int i=map.get(peek); i<n-1; i++)
            flag1 &= (arr[i] > arr[i+1]);
        
        return flag1 && flag2 && map.get(peek)!=0 && map.get(peek)!=n-1;
    }
}