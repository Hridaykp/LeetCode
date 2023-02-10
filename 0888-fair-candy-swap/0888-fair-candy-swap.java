class Solution { 
    private int binarySearch(int[] arr,int target){ 
        int l = 0, r = arr.length-1;   
        while(l <= r){
            int mid = l+(r-l)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid]<target) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
    
    public int[] fairCandySwap(int[] a, int[] b) { 
        int sum_A = 0,sum_B = 0;
        for(int i=0; i<a.length; i++)
            sum_A += a[i];
        for(int i=0; i<b.length; i++)
            sum_B += b[i];
        int diff = (sum_A-sum_B)/2;
        Arrays.sort(a);
        for(int num : b){
            if (binarySearch(a, num+diff) != -1) 
                return new int[]{num+diff, num};
        } 
        return null; 
    }
}