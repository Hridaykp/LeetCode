class Solution {
    private void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList();
        inorder(root, list);
        int arr[] = new int [list.size()];
        for(int i=0; i<list.size(); i++)
            arr[i] = list.get(i);
        int min = Integer.MAX_VALUE;
        
        for(int i=1; i<arr.length; i++){
            int dist = arr[i]-arr[i-1];
            min = Math.min(min, dist);
        }
        return min;
    }
}