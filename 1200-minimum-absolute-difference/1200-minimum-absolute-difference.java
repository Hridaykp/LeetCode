class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++)
            min = Math.min(min, arr[i+1]-arr[i]);
        for(int i=0; i<n-1; i++){ 
            if(min == arr[i+1]-arr[i]){
                List<Integer> list = new ArrayList();
                list.add(arr[i]);
                list.add(arr[i+1]);
                res.add(list);
            }
        }
        return res; 
    }
}